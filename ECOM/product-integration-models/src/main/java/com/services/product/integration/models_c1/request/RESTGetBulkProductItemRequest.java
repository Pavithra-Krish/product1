package com.services.product.integration.models_c1.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * Created by Pavithra on 3/12/14.
 */
public class RESTGetBulkProductItemRequest {

    private List<RESTBulkProductRequest> products;

    @XmlElement(name = "product")
    @XmlElementWrapper(name = "products")
    public List<RESTBulkProductRequest> getProducts() {
        return products;
    }

    public void setProducts(final List<RESTBulkProductRequest> products) {
        this.products = products;
    }

}
