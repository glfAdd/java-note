package glfadd.exception;

import glfadd.controller.HttpBaseResponse;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

// 给控制器添加方法
@ControllerAdvice
public class BaseExceptionHandler {
    // 将 return 的值写到 response 的 body 中
    @ResponseBody
    // 统一处理抛出的异常, 可以指定异常的类型
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public HttpBaseResponse handler(MethodArgumentNotValidException e) {
        FieldError fieldError = e.getBindingResult().getFieldError();
        return HttpBaseResponse.builder().code(401).msg(fieldError.getDefaultMessage()).build();
    }
}
