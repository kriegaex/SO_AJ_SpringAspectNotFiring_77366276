package com.projects.errorhandling.exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ResourceNotFoundExceptionTest {

    @Test
    void testExceptionIsThrownWithCorrectMessage() {
        Throwable exception = assertThrows(ResourceNotFoundException.class, () -> {
            throwResourceNotFoundException();
        });
        assertEquals("Test exception message", exception.getMessage());
    }

    private void throwResourceNotFoundException() {
        throw new ResourceNotFoundException("Test exception message", null);
    }
}

