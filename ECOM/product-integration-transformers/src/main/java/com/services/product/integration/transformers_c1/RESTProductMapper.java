package com.services.product.integration.transformers_c1;

import com.services.product.domain.models_c1.Product;
import com.services.product.integration.models_c1.RESTProduct;

//import com.sun.jersey.spi.inject.Inject;

/**
 * Created by Pavithra on 3/11/14.
 */
public class RESTProductMapper implements MapperFactory<RESTProduct, Product> {



    private ProductIntegrationMapper productIntegrationMapper=new ProductIntegrationMapper();
    /*@Inject
    RESTProductMapper( ProductIntegrationMapper productIntegrationMapper){
        this.productIntegrationMapper=productIntegrationMapper;
    }*/

    @Override
    public Product toDTO(final RESTProduct input) {
        return productIntegrationMapper.map(input, Product.class);
    }

    @Override
    public RESTProduct fromDTO(final Product input) {
        return productIntegrationMapper.map(input, RESTProduct.class);
    }
}
