package com.projects.errorhandling.service;

import com.projects.errorhandling.annotation.ExceptionAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service

@Slf4j
public class TestService {

    @ExceptionAnnotation
   public void test() {
       log.debug("Test debug message");
      throw new RuntimeException("Test exception");
   }
}
