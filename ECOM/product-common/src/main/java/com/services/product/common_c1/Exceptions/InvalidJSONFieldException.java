package com.services.product.common_c1.Exceptions;

/**
 * Created by Pavithra on 3/12/14.
 */
public class InvalidJSONFieldException extends PayloadException {

    public InvalidJSONFieldException(final Object entity, final String message) {

        super(entity, message);
    }
}
