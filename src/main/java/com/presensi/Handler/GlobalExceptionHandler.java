package com.presensi.Handler;

import com.presensi.Exception.CustomResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<?> handleMissingRequestBody(HttpMessageNotReadableException ex) {
        Map<String, Object> objecmapping = new HashMap<>();
        objecmapping.put("response", "not required access");
        return ResponseEntity.badRequest()
                .body(objecmapping);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleMissingNotfound(ResourceNotFoundException ex) {
        Map<String, Object> objecmapping = new HashMap<>();
        objecmapping.put("response", "Page Not Found");
        return ResponseEntity.badRequest()
                .body(objecmapping);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<?> handleNoHandlerFound(
            NoHandlerFoundException ex, HttpServletRequest request) {
        Map<String, Object> objecmapping = new HashMap<>();
        objecmapping.put("response", "Endpoint " + ex.getRequestURL() + " tidak ditemukan");
        return ResponseEntity.badRequest()
                .body(objecmapping);
    }
}
