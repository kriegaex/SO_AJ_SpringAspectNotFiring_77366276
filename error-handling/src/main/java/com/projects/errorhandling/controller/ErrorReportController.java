package com.projects.errorhandling.controller;

import com.projects.errorhandling.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/errors")
public class ErrorReportController {

    public ErrorResponse lastReceivedError;

    @PostMapping("/report")
    public ResponseEntity<String> reportError(@RequestBody ErrorResponse apiError) {
        lastReceivedError = apiError;
        return ResponseEntity.ok("Error received and logged.");
    }

    @GetMapping("/error")
    public ResponseEntity<ErrorResponse> getSampleErrorReport() {
        if (lastReceivedError == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(lastReceivedError);
    }
}
