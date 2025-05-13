package com.presensi.Conrollers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/schedule")
public class ScheduleController {

    private HttpStatus httpStatus;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
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


//    @RequestMapping("/store")
//    public ResponseEntity<?> store(@RequestBody() String param) throws Exception {
//        Map<String, Object> mappig = new HashMap();
//        try {
//            mappig.put("data", "");
//            httpStatus = HttpStatus.OK;
//        } catch (Exception e) {
//            mappig.put("data", "");
//            httpStatus = HttpStatus.BAD_REQUEST;
//        }
//        return new ResponseEntity<>(mappig, httpStatus);
//    }


//    @RequestMapping("/show")
//    public ResponseEntity<?> upate(@RequestBody() String param) throws Exception {
//        Map<String, Object> mappig = new HashMap();
//        try {
//            mappig.put("data", "");
//            httpStatus = HttpStatus.OK;
//        } catch (Exception e) {
//            mappig.put("data", "");
//            httpStatus = HttpStatus.BAD_REQUEST;
//        }
//        return new ResponseEntity<>(mappig, httpStatus);
//    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> update(@PathVariable("id") Long id) throws Exception {
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

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> showDetail(@PathVariable("id") Long id) {
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
}
