package glfadd.config;

/*
分页拦截器是一个插件，用于拦截执行 SQL 语句的过程，以实现分页查询的功能。通过使用分页拦截器，您可以在执行 SQL 查询时自动添加分页查询的相关逻辑，而无需手动编写分页查询的 SQL 语句

通过将这个配置类添加到 Spring Boot 项目中，分页拦截器将会自动生效，并在执行 SQL 查询时拦截查询过程，自动添加分页查询的相关逻辑

分页拦截器通常是以插件的形式存在的，需要将其添加到 MyBatis 的配置中。在 MyBatis-Plus 中，可以使用 PaginationInterceptor 类来实现分页拦截器

直接调用 MyBatis-Plus 提供的分页查询方法，例如 selectPage() 方法，而无需手动编写分页查询的 SQL 语句。分页拦截器会在执行查询时自动处理分页逻辑，并返回分页结果
*/

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {
    /**
     * 添加分页插件, 不添加这个插件 selectPage 分页无效, 仍然返回所有的数据
     *
     * @return
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //如果配置多个插件,切记分页最后添加
        PaginationInnerInterceptor p = new PaginationInnerInterceptor();
        // 如果有多数据源可以不配具体类型 否则都建议配上具体的DbType
        p.setDbType(DbType.MYSQL);
        // 设置最大单页限制数量，默认 500 条，-1 不受限制
//        p.setMaxLimit(1L);
        // 用于设置是否开启溢出处理。如果将参数设置为 true，表示开启溢出处理，MyBatis-Plus 将按照溢出处理策略进行处理；如果设置为 false，则表示不开启溢出处理，查询结果将按照正常逻辑返回
//        p.setOverflow(true);
        interceptor.addInnerInterceptor(p);
        return interceptor;
    }

}
