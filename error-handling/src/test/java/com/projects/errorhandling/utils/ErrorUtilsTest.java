package com.projects.errorhandling.utils;

import com.projects.errorhandling.exceptions.ResourceNotFoundException;
import com.projects.errorhandling.model.ErrorResponse;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class ErrorUtilsTest {

    @Test
    public void testTransformExceptionToResponse() {
        // Given
        String testMessage = "Test exception message";
        ResourceNotFoundException exception = new ResourceNotFoundException(testMessage, null);

        // When
        ErrorResponse response = ErrorUtils.transformExceptionToResponse(exception);

        // Then
        assertNotNull(response, "Response should not be null");
        assertEquals(testMessage, response.getMessage(), "Message should match the exception's message");
        assertNotNull(response.getTimestamp(), "Timestamp should not be null");
        assertTrue(response.getTimestamp().isBefore(LocalDateTime.now()) && response.getTimestamp().isAfter(LocalDateTime.now().minusMinutes(1)), "Timestamp should be recent");
        assertEquals(404, response.getStatus(), "Status should be 404");
        assertEquals("Not Found", response.getError(), "Error should be 'Not Found'");
        assertEquals("/accounts/{1}", response.getPath(), "Path should be '/accounts/{1}'");
    }
}

