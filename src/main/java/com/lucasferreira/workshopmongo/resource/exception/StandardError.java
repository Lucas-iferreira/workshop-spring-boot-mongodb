package com.lucasferreira.workshopmongo.resource.exception;

import java.io.Serial;
import java.io.Serializable;

public class StandardError implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;


    private Long timestamp;
    private Integer status;
    private String error;
    private String path;

    public StandardError() {
    }

    public StandardError(Long timestamp, Integer status, String error, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.path = path;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
