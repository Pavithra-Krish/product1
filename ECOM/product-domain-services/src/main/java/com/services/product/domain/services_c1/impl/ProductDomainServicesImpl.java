package com.services.product.domain.services_c1.impl;

import com.services.product.domain.models_c1.Product;
import com.services.product.domain.services_c1.interfaces.ProductDomainServices;

import java.util.List;

/**
 * Created by Pavithra on 3/10/14.
 */
public class ProductDomainServicesImpl implements ProductDomainServices {

    private final Product product=new Product();
    private static final String INVALIDProdID = "999";
    private static final String COLLECTIONPRODUCTProdID = "111";
    private List<Product> collectionOfProducts;
    private static final String IN_STOCK = "In Stock";

    public ProductDomainServicesImpl(String productService) {
    }

    @Override
    public Product getProductByProdID(final String ProdID)
    {

       /* if (ProdID.equals(INVALIDProdID)) {
          //  throw new DataServiceException(ProdID, new ErrorContainer("PROD2000", "Prod ID (<Prod ID>) not found."));
        }
        if (ProdID.equals(COLLECTIONPRODUCTProdID)) {
                for (Product collectionOfProduct : collectionOfProducts) {
                    collectionOfProduct.setProdID(ProdID);
                }
                product.setCollection(collectionOfProducts);

        }
        if (product != null) {
            product.setProdID(ProdID);
        }*/
        return product;
    }
}
