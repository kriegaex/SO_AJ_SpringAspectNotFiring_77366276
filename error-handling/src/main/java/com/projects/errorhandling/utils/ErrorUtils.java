package com.projects.errorhandling.utils;

import com.projects.errorhandling.exceptions.ResourceNotFoundException;
import com.projects.errorhandling.model.ErrorResponse;

import java.time.LocalDateTime;

public class ErrorUtils {

    public static ErrorResponse transformExceptionToResponse(ResourceNotFoundException ex) {
        ErrorResponse response = new ErrorResponse();
        response.setMessage(ex.getMessage());
        response.setTimestamp(LocalDateTime.now());
        response.setStatus(404);
        response.setError("Not Found");
        response.setPath("/accounts/{1}");
        return response;
    }
}

