package com.projects.errorhandling.aspect;

import com.projects.errorhandling.exceptions.ResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class ErrorAspect {

    public ErrorAspect() {
        System.out.println("Initializing ExceptionHandlerAspect");
        log.debug("Initializing ExceptionHandlerAspect");
    }

    @Pointcut("@annotation(com.projects.errorhandling.annotation.ExceptionAnnotation)")
    public void exceptionPointcut() {
        System.out.println("exceptionPointcut");
    }

    @Around("exceptionPointcut()")
    public Object handleErrors(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            Object result = joinPoint.proceed();

            return result;

        } catch (ResourceNotFoundException t) {
            String methodName = joinPoint.getSignature().getName();
            String message = "Loki, it looks like it is not found in method " + methodName + ": " + t.getMessage();

            log.info(message);

            throw t;
        }
    }
}



/*
 @Pointcut("execution(* com.*.*.*(..))")
    public void exceptionPointcut() {
        System.out.println("exceptionPointcut");
    }

    @AfterThrowing(pointcut = "exceptionPointcut()", throwing = "ex")
    public void handleException(ResourceNotFoundException ex){
        System.out.println("handleException");
    }
 */