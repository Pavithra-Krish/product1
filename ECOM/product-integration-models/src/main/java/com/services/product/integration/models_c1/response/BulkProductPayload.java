package com.services.product.integration.models_c1.response;

import com.services.product.integration.models_c1.RESTBulkProduct;
import com.services.product.integration.models_c1.request.RESTProductItemRequest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.List;

/**
 * Created by Pavithra on 3/11/14.
 */
@XmlRootElement(name = "payload")
@XmlSeeAlso({RESTBulkProduct.class, RESTProductItemRequest.class})
public class BulkProductPayload<T> {

    private List<T> products;

    @XmlElement(name = "product")
    @XmlElementWrapper(name = "products")
    public List<T> getProducts() {
        return products;
    }

    public void setProducts(final List<T> products) {
        this.products = products;
    }
}