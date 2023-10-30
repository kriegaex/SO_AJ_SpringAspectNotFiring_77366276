package com.projects.errorhandling.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@Data
public class ErrorResponse {
    private String message;
    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String path;

    public ErrorResponse() {
        log.info("ErrorResponse constructor");
    }
}

/*
This class seems to be a representation of an error response that will be returned by some API or service.
 */
