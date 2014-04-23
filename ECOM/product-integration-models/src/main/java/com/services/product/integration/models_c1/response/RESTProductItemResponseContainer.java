package com.services.product.integration.models_c1.response;

import com.services.product.common_c1.response.ResponseContainer;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * Created by Pavithra on 3/11/14.
 */
@XmlRootElement(name = "productItemResponse")
@XmlSeeAlso({ProductPayload.class, ProductsPayload.class})
public class RESTProductItemResponseContainer<T> extends ResponseContainer<T> {
}