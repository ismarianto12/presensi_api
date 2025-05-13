package com.presensi.Conrollers;

import com.presensi.Exception.CustomResponse;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;

@RequestMapping("/api/v1")
public class RoleController {


    @Autowired
    private HttpStatus httpStatus;

    public ResponseEntity<?> indexData() {
        try {

            Map<String, Object> map = new HashMap<>();

            map.put("data", "");
            map.put("result", "200");
            CustomResponse<String> response = new CustomResponse<>("Sample Data", "Data Berhasil di delete");
            response.addMapping("timestamp", System.currentTimeMillis());
            response.addMapping("status", HttpStatus.OK.value());
            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            CustomResponse<String> response = new CustomResponse<>("Sample Data", "Data Berhasil di delete");
            response.addMapping("timestamp", System.currentTimeMillis());
            response.addMapping("status", HttpStatus.OK.value());
            return new ResponseEntity<>(response, HttpStatus.OK);

        }
    }

    @RequestMapping(value = "/updateata/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateDat(@RequestBody Map<String, Object> listdata) {
        try {
            CustomResponse<String> response = new CustomResponse<>("Sample Data", "Data Berhasil di update");
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            CustomResponse<String> response = new CustomResponse<>("Sample Data", "Data Berhasil di update");
            return new ResponseEntity<>(response, HttpStatus.OK);

        }
    }

    @RequestMapping(value = "/rule/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteData(@PathVariable Long id) throws Exception {
        Map<String, Object> _responseData = new HashMap<>();
        try {
            _responseData.put("message", "data berhasil di hapus");
            return new ResponseEntity<>(_responseData, null, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("deleted successfully {}");
            _responseData.put("message", "data berhasil di hapus");
            return new ResponseEntity<>(_responseData, null, HttpStatus.CREATED);
        }

    }

}
