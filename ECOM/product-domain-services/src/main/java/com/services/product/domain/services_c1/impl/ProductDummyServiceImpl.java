package com.services.product.domain.services_c1.impl;

import com.services.product.domain.models_c1.Product;
import com.services.product.domain.services_c1.interfaces.ProductDomainServices;

import java.util.List;

/**
 * Created by Pavithra on 3/13/14.
 */

    public class ProductDummyServiceImpl implements ProductDomainServices {
        private Product product=new Product() ;
        private static final String INVALIDProdID = "999";
        private List<Product> collectionOfProducts;
        private static final String IN_STOCK = "In Stock";


        public ProductDummyServiceImpl() {

         /*   collectionOfProducts = new ArrayList<Product>();
            final Product product1 = new Product();
            product1.setProdID("2345");

            product1.setDescription("Test product from Kohl's");




            final ProductPrice price = new ProductPrice();
          //  price.setRegularPrice("20.00");
          //  price.setSalePrice("35.00");


            collectionOfProducts.add(product1);*/


        }

        @Override
        public Product getProductByProdID(final String ProdID) {

            /*for(Product coll: collectionOfProducts)
            {
                coll.setProdID(ProdID);
                coll.setDescription("this is first");
            }
            product.setCollection(collectionOfProducts);*/
            product.setProdID("123456789");
            product.setDescription("this is first");
            product.setBrand("PUMA");
            product.setStatus(IN_STOCK);



            return product;
        }


    }
