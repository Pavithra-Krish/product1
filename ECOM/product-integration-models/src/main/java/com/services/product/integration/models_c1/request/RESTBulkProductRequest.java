package com.services.product.integration.models_c1.request;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Pavithra on 3/12/14.
 */
public class RESTBulkProductRequest {

    @JsonProperty("ProdID")
    private String ProdID;

    @XmlElement(name = "ProdID")
    public String getProdID() {
        return ProdID;
    }

    public void setProdID(final String ProdID) {
        this.ProdID = ProdID;
    }
}
