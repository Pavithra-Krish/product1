package com.services.product.integration.transformers_c1;

/**
 * Created by Pavithra on 3/11/14.
 */
public interface MapperFactory<F,T> {

    T toDTO(final F input);
    F fromDTO(final T input);
}
