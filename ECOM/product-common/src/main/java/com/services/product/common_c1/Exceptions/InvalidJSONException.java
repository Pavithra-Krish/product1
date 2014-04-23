package com.services.product.common_c1.Exceptions;

/**
 * Created by Pavithra on 3/12/14.
 */
public class InvalidJSONException extends PayloadException {

    public InvalidJSONException(final Object entity, final String message) {

        super(entity, message);
    }
}