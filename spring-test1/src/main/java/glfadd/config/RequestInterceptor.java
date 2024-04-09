package glfadd.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StreamUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
public class RequestInterceptor implements HandlerInterceptor {
    /**
     * 该方法在控制器处理请求方法前执行，其返回值表示是否中断后续操作，返回 true 表示继续向下执行，返回 false 表示中断后续操作。
     *
     * @param httpServletRequest  current HTTP request
     * @param httpServletResponse current HTTP response
     * @param o                   chosen handler to execute, for type and/or instance evaluation
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //获取请求参数
        String queryString = httpServletRequest.getQueryString();
        log.info("请求参数:{}", queryString);

        //获取请求body
        byte[] bodyBytes = StreamUtils.copyToByteArray(httpServletRequest.getInputStream());
        String body = new String(bodyBytes, httpServletRequest.getCharacterEncoding());

        log.info("请求体：{}", body);
        return true;
    }

    /**
     * 该方法在控制器处理请求方法调用之后、解析视图之前执行，可以通过此方法对请求域中的模型和视图做进一步修改。
     *
     * @param request      current HTTP request
     * @param response     current HTTP response
     * @param o            the handler (or {@link HandlerMethod}) that started asynchronous
     *                     execution, for type and/or instance examination
     * @param modelAndView the {@code ModelAndView} that the handler returned
     *                     (can also be {@code null})
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {


    }

    /**
     * 该方法在视图渲染结束后执行，可以通过此方法实现资源清理、记录日志信息等工作。
     *
     * @param request  current HTTP request
     * @param response current HTTP response
     * @param o        the handler (or {@link HandlerMethod}) that started asynchronous
     *                 execution, for type and/or instance examination
     * @param e        any exception thrown on handler execution, if any; this does not
     *                 include exceptions that have been handled through an exception resolver
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {

    }

}
