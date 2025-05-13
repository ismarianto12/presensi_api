package com.presensi.Conrollers;

import com.presensi.Exception.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.*;

@RestController
@RequestMapping("/api/v1/presensi")
public class PresensiController {

    private HttpStatus httpStatus;

    @RequestMapping("/list")
    public ResponseEntity<?> getData(@RequestBody() String param) throws Exception {
        Map<String, Object> mappig = new HashMap();
        try {
            mappig.put("data", "");
            httpStatus = HttpStatus.OK;
        } catch (Exception e) {
            mappig.put("data", "");
            httpStatus = HttpStatus.BAD_REQUEST;
        }
        return new ResponseEntity<>(mappig, httpStatus);
    }

    @RequestMapping("/store")
    public ResponseEntity<?> storeData(@RequestBody() Map<String, Object> list) {
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
