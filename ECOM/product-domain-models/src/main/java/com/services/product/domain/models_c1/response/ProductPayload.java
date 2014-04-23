package com.services.product.domain.models_c1.response;

import com.services.product.domain.models_c1.Product;

/**
 * Created by Pavithra on 3/10/14.
 */
public class ProductPayload {

    private Product product;

    public Product getProduct(){
        return product;
    }

    public void setProduct(final Product product){
        this.product=product;
    }

}
