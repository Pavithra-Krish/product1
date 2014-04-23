package com.services.product.common_c1.Exceptions;

import com.services.product.common_c1.response.ErrorContainer;

/**
 * Created by Pavithra on 3/11/14.
 */
public class DataServiceException {
    protected ErrorContainer container;


    public DataServiceException() {
    }

    public DataServiceException(final String message) {
        super();
    }

    public DataServiceException(final String message, final ErrorContainer container) {
        super();
        this.container = container;
    }
}
