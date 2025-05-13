package com.presensi.Exception;

import java.util.HashMap;
import java.util.Map;

public class CustomResponse<T> {
    public T data;
    public String message;
    Map<String, Object> mapping = new HashMap<>();

    public CustomResponse(T data, String message) {
        this.data = data;
        this.message = message;

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getMapping() {
        return mapping;
    }

    public void addMapping(String key, Object value) {
        this.mapping.put(key, value);
    }

}
