package com.services.product.integration.transformers_c1;

import com.services.product.domain.models_c1.request.BulkProductRequest;
import com.services.product.integration.models_c1.request.RESTBulkProductRequest;

/**
 * Created by Pavithra on 3/12/14.
 */
public class RESTBulkProductRequestMapper  implements MapperFactory<RESTBulkProductRequest, BulkProductRequest> {


    private ProductIntegrationMapper productIntegrationMapper =new ProductIntegrationMapper();
  /*  @Inject
   RESTBulkProductRequestMapper( ProductIntegrationMapper productIntegrationMapper){
        this.productIntegrationMapper=productIntegrationMapper;
    }
*/
    @Override
    public BulkProductRequest toDTO(final RESTBulkProductRequest input) {
        return productIntegrationMapper.map(input, BulkProductRequest.class);
    }

    @Override
    public RESTBulkProductRequest fromDTO(final BulkProductRequest input) {
        return productIntegrationMapper.map(input, RESTBulkProductRequest.class);
    }

}
