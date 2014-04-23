package com.services.product.integration.models_c1;

import com.services.product.common_c1.response.ErrorContainer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * Created by Pavithra on 3/11/14.
 */
public class RESTBulkProduct {


    private String ProdID;
    private String description;
    private RESTProductPrice price;
    private String brand;
    private String status;
    private String title;
    private List<RESTProduct> collection;
    private ErrorContainer error;




    @XmlElement(name = "productTitle")
    public String getTitle() {

        return title;
    }

    public void setTitle(final String title) {

        this.title = title;
    }



    @XmlElement(name = "brand")
    public String getBrand() {

        return brand;
    }

    public void setBrand(final String brand) {

        this.brand = brand;
    }

    @XmlElement(name = "description")
    public String getDescription() {

        return description;
    }

    public void setDescription(final String description) {

        this.description = description;
    }

    @XmlElement(name = "price")
    public RESTProductPrice getPrice() {

        return price;
    }

    public void setPrice(final RESTProductPrice price) {

        this.price = price;
    }

    @XmlElement(name = "ProdID")
    public String getProdID() {

        return ProdID;
    }

    public void setProdID(final String webID) {

        this.ProdID = ProdID;
    }

    @XmlElement(name = "productStatus")
    public String getStatus() {

        return status;
    }

    public void setStatus(final String status) {

        this.status = status;
    }

    @XmlElement(name = "product")
    @XmlElementWrapper(name = "collection")
    public List<RESTProduct> getCollection() {

        return collection;
    }

    public void setCollection(final List<RESTProduct> collection) {

        this.collection = collection;
    }

    public ErrorContainer getError() {
        return error;
    }

    @XmlElement(name = "error")
    public void setError(final ErrorContainer error) {
        this.error = error;
    }





}
