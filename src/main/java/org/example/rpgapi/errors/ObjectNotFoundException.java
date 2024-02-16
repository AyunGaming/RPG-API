package org.example.rpgapi.errors;

import org.springframework.http.HttpStatus;

public class ObjectNotFoundException extends APIException{
    public ObjectNotFoundException(String message) {
        super(HttpStatus.NOT_FOUND, message);
    }
}
