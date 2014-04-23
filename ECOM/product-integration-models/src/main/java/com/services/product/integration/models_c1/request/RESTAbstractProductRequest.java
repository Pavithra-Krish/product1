package com.services.product.integration.models_c1.request;


import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Pavithra on 3/11/14.
 */
public abstract class RESTAbstractProductRequest {

    @JsonProperty("payload")
    private RESTGetBulkProductItemRequest productItemBulkRequestPayload;

    @XmlElement(name = "payload")
    public RESTGetBulkProductItemRequest getProductItemBulkRequestPayload() {
        return productItemBulkRequestPayload;
    }

    public void setProductItemBulkRequestPayload(final RESTGetBulkProductItemRequest productItemBulkRequestPayload) {
        this.productItemBulkRequestPayload = productItemBulkRequestPayload;
    }
}
