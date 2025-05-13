package com.presensi.Conrollers;

import com.presensi.Exception.CustomResponse;
import com.presensi.Models.Role;
import com.presensi.Repository.RoleRepository;
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

    @Autowired
    private RoleRepository roleRepository;

    public ResponseEntity<?> indexData() {
        try {

            List<Role> data = roleRepository.findAll();
            Map<String, Object> map = new HashMap<>();
            map.put("data", data);
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

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> createData(@RequestBody Role _role) {
        try {
            roleRepository.save(_role);
            CustomResponse<String> response = new CustomResponse<>("Sample Data", "Data Berhasil di update");
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();

            CustomResponse<String> response = new CustomResponse<>("eror code", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

        }
    }

    @RequestMapping(value = "/updateata/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateDat(@RequestBody Role _role, @PathVariable("id") Long id) {
        try {

            roleRepository.findById(id);
            roleRepository.save(_role);

            CustomResponse<String> response = new CustomResponse<>("Sample Data", "Data Berhasil di update");
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            CustomResponse<String> response = new CustomResponse<>("Sample Data", "Data Berhasil di update");
            return new ResponseEntity<>(response, HttpStatus.OK);

        }
    }

    @RequestMapping(value = "/rule/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteData(@PathVariable("id") Long id) throws Exception {
        Map<String, Object> _responseData = new HashMap<>();
        try {
            roleRepository.deleteById(id);
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
