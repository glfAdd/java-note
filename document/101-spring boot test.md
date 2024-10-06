```java
package com.example.demo;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class DemoApplicationTests {
    public final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Test
    public void demoOne(){
        logger.debug("debug");
        logger.warn("warn");
        logger.info("info");
        logger.error("error");
    }
}
```

