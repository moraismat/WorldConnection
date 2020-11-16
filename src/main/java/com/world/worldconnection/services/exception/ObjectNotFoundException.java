package com.world.worldconnection.services.exception;

public class ObjectNotFoundException extends RuntimeException{
    private static final long serialVersionUD = 1l;

    public ObjectNotFoundException(String msg){
        super(msg);
    }

    public ObjectNotFoundException(String msg, Throwable cause){
        super(msg, cause);
    }
}
