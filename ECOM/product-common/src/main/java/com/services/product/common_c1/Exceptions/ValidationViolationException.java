package com.services.product.common_c1.Exceptions;

/**
 * Created by Pavithra on 3/12/14.
 */
public class ValidationViolationException extends Exception {
    private Object entity;

    public ValidationViolationException(final Object entity, final String message) {
        super(message);
        this.entity = entity;
    }

    public Object getEntity() {

        return entity;
    }

    public void setEntity(final Object entity) {

        this.entity = entity;
    }
}