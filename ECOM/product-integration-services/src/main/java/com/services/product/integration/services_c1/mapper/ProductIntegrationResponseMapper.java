package com.services.product.integration.services_c1.mapper;

import com.services.product.domain.models_c1.BulkProduct;
import com.services.product.domain.models_c1.Product;
import com.services.product.domain.models_c1.request.BulkProductRequest;
import com.services.product.integration.models_c1.RESTBulkProduct;
import com.services.product.integration.models_c1.RESTProduct;
import com.services.product.integration.models_c1.request.RESTBulkProductRequest;
import com.services.product.integration.transformers_c1.RESTBulkProductMapper;
import com.services.product.integration.transformers_c1.RESTBulkProductRequestMapper;
import com.services.product.integration.transformers_c1.RESTProductMapper;
import org.apache.commons.collections.CollectionUtils;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavithra on 3/11/14.
 */

public class ProductIntegrationResponseMapper implements IntegrationResponseMapper {


    private final RESTProductMapper restProductMapper;
    private final RESTBulkProductRequestMapper restBulkProductRequestMapper;
    private final RESTBulkProductMapper restBulkProductMapper;


    @Inject
    public ProductIntegrationResponseMapper(final RESTProductMapper restProductMapper,
                                            final RESTBulkProductRequestMapper restBulkProductRequestMapper,
                                            final RESTBulkProductMapper restBulkProductMapper) {

        this.restProductMapper = restProductMapper;
        this.restBulkProductRequestMapper = restBulkProductRequestMapper;
        this.restBulkProductMapper = restBulkProductMapper;
    }


    @Override
    public RESTProduct mapProduct(final Product product) {
        return restProductMapper.fromDTO(product);
    }

    @Override
    public BulkProductRequest mapRESTBulkProduct(final RESTBulkProductRequest restBulkProductRequest) {
        return restBulkProductRequestMapper.toDTO(restBulkProductRequest);
    }

    @Override
    public RESTBulkProduct mapBulkRESTProduct(final BulkProduct product) {
        return restBulkProductMapper.fromDTO(product);
    }

    @Override
    public Product mapRESTProduct(final RESTProduct restProduct) {
        return restProductMapper.toDTO(restProduct);
    }

    @Override
    public List<BulkProductRequest> mapRESTProducts(final List<RESTBulkProductRequest> restProducts) {

        final List<BulkProductRequest> products = new ArrayList<BulkProductRequest>();

        if(CollectionUtils.isNotEmpty(restProducts)) {
            for (RESTBulkProductRequest restProduct : restProducts) {
                products.add(restBulkProductRequestMapper.toDTO(restProduct));
            }
        }
        return products;
    }

    @Override
    public List<RESTBulkProductRequest> mapBulkRESTProductsRequest(final List<BulkProductRequest> bulkProductRequests) {

        final List<RESTBulkProductRequest> products = new ArrayList<RESTBulkProductRequest>();

        if(CollectionUtils.isNotEmpty(bulkProductRequests)) {
            for (BulkProductRequest bulkProductRequest : bulkProductRequests) {
                products.add(restBulkProductRequestMapper.fromDTO(bulkProductRequest));
            }
        }
        return products;
    }

    @Override
    public List<RESTBulkProduct> mapBulkRESTProducts(final List<BulkProduct> bulkProducts) {

        final List<RESTBulkProduct> products = new ArrayList<RESTBulkProduct>();

        if(CollectionUtils.isNotEmpty(bulkProducts)) {
            for (BulkProduct bulkProduct : bulkProducts) {
                products.add(restBulkProductMapper.fromDTO(bulkProduct));
            }
        }
        return products;
    }



}
