package com.backendPortfolio.springBootCommerce.services.exceptions;

public class ResourceNotFindException extends RuntimeException {
    public ResourceNotFindException(Object id){
        super("Resource not found. Id: "+ id );
    }
}
