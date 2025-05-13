package com.presensi.Conrollers;

import com.presensi.Exception.CustomResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class LoginController {

    public HttpStatus httpStatus;

    public ResponseEntity<?> listdat() {
        Map<String, Object> mappig = new HashMap();
        try {
            mappig.put("data", "");
            httpStatus = HttpStatus.OK;
        } catch (Exception e) {
            mappig.put("data", "");
            httpStatus = HttpStatus.BAD_REQUEST;
        }
        CustomResponse<String> response = new CustomResponse<>("Sample Data", "Request was successful");
        response.addMapping("timestamp", System.currentTimeMillis());
        response.addMapping("status", HttpStatus.OK.value());
        return new ResponseEntity<>(response, HttpStatus.OK);

    }
}
