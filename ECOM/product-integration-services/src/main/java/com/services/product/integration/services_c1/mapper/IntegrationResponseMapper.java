package com.services.product.integration.services_c1.mapper;

import com.services.product.domain.models_c1.BulkProduct;
import com.services.product.domain.models_c1.Product;
import com.services.product.domain.models_c1.request.BulkProductRequest;
import com.services.product.integration.models_c1.RESTBulkProduct;
import com.services.product.integration.models_c1.RESTProduct;
import com.services.product.integration.models_c1.request.RESTBulkProductRequest;

import java.util.List;

/**
 * Created by Pavithra on 3/11/14.
 */
public interface IntegrationResponseMapper {

    RESTProduct mapProduct(final Product product);

    Product mapRESTProduct(final RESTProduct restProduct);

    BulkProductRequest mapRESTBulkProduct(final RESTBulkProductRequest restBulkProductRequest);

    List<BulkProductRequest> mapRESTProducts(final List<RESTBulkProductRequest> restProducts);

    List<RESTBulkProductRequest> mapBulkRESTProductsRequest(final List<BulkProductRequest> bulkProductRequests);

    List<RESTBulkProduct> mapBulkRESTProducts(final List<BulkProduct> bulkProducts);            //NOPMD

    RESTBulkProduct mapBulkRESTProduct(final BulkProduct bulkProduct);            //NOPMD


}
