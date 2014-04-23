package com.services.product.integration.models_c1.response;

import com.services.product.integration.models_c1.RESTProduct;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Pavithra on 3/11/14.
 */
@XmlRootElement(name = "payload")
public class ProductPayload {
    private RESTProduct product;

    @XmlElement(name = "product")
    public RESTProduct getProduct() {

        return product;
    }

    public void setProduct(final RESTProduct product) {

        this.product = product;
    }
}
