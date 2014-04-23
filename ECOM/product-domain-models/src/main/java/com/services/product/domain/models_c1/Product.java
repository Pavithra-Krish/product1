package com.services.product.domain.models_c1;

import java.util.List;

/**
 * Created by Pavithra on 3/10/14.
 */
public class Product {

    private String ProdID;
    private String title;
    private String Description;
    private String status;
    private String brand;
    private List<Product> collection;
    private ProductPrice price=new ProductPrice();


    public String getProdID() {
        return ProdID;
    }

    public void setProdID(final String ProdID){
        this.ProdID= ProdID;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(final String ProdTitle ) {
        this.title=title;
    }

    public String getDescription() {

        return Description;
    }

    public void setDescription(final String Description) {

        this.Description = Description;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(final String status){
        this.status=status;
    }


    public String getBrand(){
        return brand;
    }

    public void setBrand(final String brand){
        this.brand=brand;
    }

    public List<Product> getCollection() {

        return collection;
    }

    public void setCollection(final List<Product> collection) {

        this.collection = collection;
    }

}

