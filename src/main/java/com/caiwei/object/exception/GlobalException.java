package com.caiwei.object.exception;

import com.caiwei.object.response.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class GlobalException {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result handleException(Exception e) {
        log.info("error_message = " + e.getMessage());
        return Result.error(e.getMessage());
    }

/*    // 你可以为特定的异常定义特定的处理方法
    @ExceptionHandler(value = CustomException.class)
    public ResponseEntity<Object> handleCustomException(CustomException e) {
        // ...
    }*/
}
