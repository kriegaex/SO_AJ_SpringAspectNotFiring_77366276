package com.projects.errorhandling.aspect;

import com.projects.errorhandling.service.TestService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ExceptionHandlerAspectTest {

    private TestService testService;
    @Mock
    private ProceedingJoinPoint proceedingJoinPoint;

    private ErrorAspect exceptionHandlerAspect = new ErrorAspect();

    @Test
    public void logException() {
        try {
            testService.test();
        } catch (Throwable ignored) {
            System.out.println("Exception caught");
        }
    }

    @Test
    public void aspectTest() throws Throwable {
        exceptionHandlerAspect.handleErrors(proceedingJoinPoint);
    }
}


