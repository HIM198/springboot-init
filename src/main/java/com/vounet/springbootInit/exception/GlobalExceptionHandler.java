package com.vounet.springbootInit.exception;

import com.vounet.springbootInit.domain.enums.ErrorCode;
import com.vounet.springbootInit.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public R businessExceptionHandler(BusinessException e) {
        log.error("BusinessException.......................", e);
        return R.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public R runtimeExceptionHandler(RuntimeException e) {
        log.error("RuntimeException...........................", e);
        return R.error(ErrorCode.SYSTEM_ERROR, "自定义系统内部异常");
    }
}