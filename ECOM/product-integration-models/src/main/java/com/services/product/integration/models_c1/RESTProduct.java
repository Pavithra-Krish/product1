package com.services.product.integration.models_c1;

import com.services.product.domain.models_c1.ProductPrice;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Pavithra on 3/11/14.
 */
@XmlRootElement(name = "product")
/*@XmlType(propOrder = {"brand","description","status"})*/
public class RESTProduct {
    private String ProdID;
    private String title;
    private String Description;
    private String status;
    private String brand;
   // private List<Product> collection;
    private ProductPrice price=new ProductPrice();



    @XmlElement(nillable = true, name = "ProdID")
    public String getProdID() {

        return ProdID;
    }

    public void setProdID(final String ProdID) {

        this.ProdID = ProdID;
    }

    @XmlElement(nillable = true, name = "product_title")
    public String gettitle() {

        return title;
    }

    public void settitle(final String title) {

        this.title = title;
    }

    @XmlElement(nillable = true, name = "brand")
    public String getBrand() {

        return brand;
    }

    public void setBrand(final String brand) {

        this.brand = brand;
    }

    @XmlElement(name = "Description")
    public String getDescription() {

        return Description;
    }

    public void setDescription(final String description) {

        this.Description = description;
    }

    @XmlElement(nillable = true, name = "productStatus")
    public String getStatus() {

        return status;
    }

    public void setStatus(final String status) {

        this.status = status;
    }


   /* @XmlElement(name = "price")
    public RESTProductPrice getPrice() {

        return price;
    }

    public void setPrice(final RESTProductPrice price) {

        this.price = price;
    }

*/


  /*  @XmlElement(name = "product")
    @XmlElementWrapper(name = "collection")
    public List<RESTProduct> getCollection() {

        return collection;
    }

    public void setCollection(final List<RESTProduct> collection) {

        this.collection = collection;
    }*/



}
