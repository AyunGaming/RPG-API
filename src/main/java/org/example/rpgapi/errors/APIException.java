package org.example.rpgapi.errors;

import org.springframework.http.HttpStatus;

/**
 * Generic exception for API
 */
public class APIException extends RuntimeException{
    private final HttpStatus status;

    /**
     * @return the http status of the error
     */
    public HttpStatus getStatus() {
        return status;
    }

    /**
     * Initialize the exception
     * @param status the http status of the error
     * @param message the message which represents the error
     */
    public APIException(HttpStatus status, String message){
        super(message);
        this.status = status;
    }

    /**
     * Initialize the exception
     * @param status the http status of the error
     */
    public APIException(HttpStatus status){
        this.status = status;
    }
}
