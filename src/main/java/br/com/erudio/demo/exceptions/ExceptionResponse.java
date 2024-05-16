package br.com.erudio.demo.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private Date timestampp;
    private String message;
    private String details;

    public ExceptionResponse(Date timestampp, String message, String details) {
        this.timestampp = timestampp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestampp() {
        return timestampp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
