package com.services.product.integration.models_c1.response;

import com.services.product.integration.models_c1.RESTProduct;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Pavithra on 3/11/14.
 */
@XmlRootElement(name = "payload")
public class ProductsPayload {
    private List<RESTProduct> products;

    @XmlElement(name = "product")
    @XmlElementWrapper(name = "products")
    public List<RESTProduct> getProducts() {

        return products;
    }

    public void setProducts(final List<RESTProduct> products) {

        this.products = products;
    }
}
