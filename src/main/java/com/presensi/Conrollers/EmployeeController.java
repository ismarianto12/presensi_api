package com.presensi.Conrollers;

import com.presensi.Exception.CustomResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    public HttpStatus httpStatus;


    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResponseEntity<?> index(){
        Map<String, Object> mappig = new HashMap();
        try {
            mappig.put("data", "");
            httpStatus = HttpStatus.OK;
        } catch (Exception e) {
            mappig.put("data", "");
            httpStatus = HttpStatus.BAD_REQUEST;
        }
        CustomResponse<String> response = new CustomResponse<>("Sample Data", "Data Berhasil di delete");
        response.addMapping("timestamp", System.currentTimeMillis());
        response.addMapping("status", HttpStatus.OK.value());
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @RequestMapping(value = "/show/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> showDetail(@PathVariable("id") Long id){
        Map<String, Object> mappig = new HashMap();
        try {
            mappig.put("data", "");
            httpStatus = HttpStatus.OK;
        } catch (Exception e) {
            mappig.put("data", "");
            httpStatus = HttpStatus.BAD_REQUEST;
        }
        CustomResponse<String> response = new CustomResponse<>("Sample Data", "Data Berhasil di delete");
        response.addMapping("timestamp", System.currentTimeMillis());
        response.addMapping("status", HttpStatus.OK.value());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<?> update(@PathVariable Long id){
        Map<String, Object> mappig = new HashMap();
        try {
            mappig.put("data", "");
            httpStatus = HttpStatus.OK;
        } catch (Exception e) {
            mappig.put("data", "");
            httpStatus = HttpStatus.BAD_REQUEST;
        }
        CustomResponse<String> response = new CustomResponse<>("Sample Data", "Data Berhasil di delete");
        response.addMapping("timestamp", System.currentTimeMillis());
        response.addMapping("status", HttpStatus.OK.value());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/list",method = RequestMethod.PUT)
    public ResponseEntity<?> listData(){
        Map<String, Object> mappig = new HashMap();
        try {
            mappig.put("data", "");
            httpStatus = HttpStatus.OK;
        } catch (Exception e) {
            mappig.put("data", "");
            httpStatus = HttpStatus.BAD_REQUEST;
        }
        CustomResponse<String> response = new CustomResponse<>("Sample Data", "Data Berhasil di delete");
        response.addMapping("timestamp", System.currentTimeMillis());
        response.addMapping("status", HttpStatus.OK.value());
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(){
        Map<String, Object> mappig = new HashMap();
        try {
            mappig.put("data", "");
            httpStatus = HttpStatus.OK;
        } catch (Exception e) {
            mappig.put("data", "");
            httpStatus = HttpStatus.BAD_REQUEST;
        }
        CustomResponse<String> response = new CustomResponse<>("Sample Data", "Data Berhasil di delete");
        response.addMapping("timestamp", System.currentTimeMillis());
        response.addMapping("status", HttpStatus.OK.value());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
