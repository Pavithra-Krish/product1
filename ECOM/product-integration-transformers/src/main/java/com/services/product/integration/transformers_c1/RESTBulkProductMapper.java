package com.services.product.integration.transformers_c1;

import com.services.product.domain.models_c1.BulkProduct;
import com.services.product.integration.models_c1.RESTBulkProduct;

/**
 * Created by Pavithra on 3/12/14.
 */
public class RESTBulkProductMapper implements MapperFactory<RESTBulkProduct,BulkProduct> {

    private ProductIntegrationMapper productIntegrationMapper =new ProductIntegrationMapper();
  /*  @Inject
    RESTBulkProductMapper( ProductIntegrationMapper productIntegrationMapper){
        this.productIntegrationMapper=productIntegrationMapper;
    }*/

    @Override
    public BulkProduct toDTO(RESTBulkProduct input) {
        return productIntegrationMapper.map(input, BulkProduct.class);
    }

    @Override
    public RESTBulkProduct fromDTO(BulkProduct input) {
        return productIntegrationMapper.map(input, RESTBulkProduct.class);
    }
}
