package com.services.product.domain.services_c1.interfaces;

import com.services.product.domain.models_c1.response.BulkProductResponse;

/**
 * Created by Pavithra on 3/12/14.
 */
public interface ProductBulkDomainService {

    BulkProductResponse getProductByProdID(String ProdID);

}
