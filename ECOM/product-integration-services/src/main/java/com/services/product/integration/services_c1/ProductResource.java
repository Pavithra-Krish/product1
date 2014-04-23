package com.services.product.integration.services_c1;


import com.kohls.services.common.validation.services_v1.util.UnMarshallerUtil;
import com.services.product.common_c1.response.ErrorContainer;
import com.services.product.common_c1.response.ResponseContainer;
import com.services.product.domain.services_c1.interfaces.ProductBulkDomainService;
import com.services.product.domain.services_c1.interfaces.ProductDomainServices;
import com.services.product.integration.models_c1.RESTBulkProduct;
import com.services.product.integration.models_c1.RESTProduct;
import com.services.product.integration.models_c1.request.ProductRequestParameterSet;
import com.services.product.integration.models_c1.request.RESTBulkProductRequest;
import com.services.product.integration.models_c1.request.RESTProductItemRequest;
import com.services.product.integration.models_c1.response.BulkProductPayload;
import com.services.product.integration.models_c1.response.RESTProductResponseCode;
import com.services.product.integration.models_c1.response.RESTProductResponseEntityBuilder;
import com.services.product.integration.services_c1.mapper.ProductIntegrationResponseMapper;
import com.sun.jersey.api.core.HttpContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by
 * Pavithra on 3/10/14.
 */

/*@SuppressWarnings("SpringJavaAutowiringInspection")*/
@javax.inject.Singleton
@Path("/product")
@Named
public class ProductResource {

    private static final Logger logger = LoggerFactory.getLogger(ProductResource.class);

    private final ProductDomainServices productDomainService;
    private final ProductBulkDomainService productBulkDomainService;
    private final ProductIntegrationResponseMapper productIntegrationResponseMapper;
    private static final int INDEX_SIZE = 0;
    private static final String PROD_ID = "ProdID";
    private static final String RETRIEVING_PRODUCT_BY_PROD_ID = "Retrieving product by PROD_ID={}";
//    private static final String GET_PRODUCT_EXTENDED_INFORMATION = "Get product extended information";
    private static final String GET_EXTENDED_INFORMATION_FOR_PRODUCT_PROD_ID ="Get extended information for product Prod_id={}" ;
    private static final String MISSING_VALUE_PASSED_FOR_PROD_ID = "Missing value passed for ProdID:";



    @Inject
    public ProductResource(final ProductDomainServices productDomainService, ProductBulkDomainService productBulkDomainService,final ProductIntegrationResponseMapper productIntegrationResponseMapper){

        this.productDomainService = productDomainService;
        this.productBulkDomainService = productBulkDomainService;
        this.productIntegrationResponseMapper = productIntegrationResponseMapper;

    }

    @GET
    @Path("{ProdID}")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Response getProductByProdID(@PathParam(ProductRequestParameterSet.PARAM_ProdID) @DefaultValue("") final String ProdID)

    {

       // boolean isDebug = false;
        Response response=null;
        RESTProduct restProduct;
        try{
            if(!ProdID.isEmpty()){
                logger.debug(GET_EXTENDED_INFORMATION_FOR_PRODUCT_PROD_ID, ProdID);
                restProduct = productIntegrationResponseMapper.mapProduct(productDomainService.getProductByProdID(ProdID));
                final ResponseContainer entity = RESTProductResponseEntityBuilder.createProductItem().payload(restProduct).build();
                response = Response.ok(entity).build();
            }
        }catch(Exception e){

        }finally {

        }
        return response;
    }


    @POST
    @Path("/bulk")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response getProductItemBulk(  @Context final HttpContext requestContext) {

        boolean isDebug = false;
        RESTProductItemRequest productItemRequest = null;
        int resultCount;
        String originalRequest = null;
        Response response=null;

        try {

            originalRequest = requestContext.getRequest().getEntity(String.class);
            final String contentType = requestContext.getRequest().getHeaderValue(HttpHeaders.CONTENT_TYPE);
            productItemRequest = UnMarshallerUtil.unmarshall(RESTProductItemRequest.class, originalRequest, contentType);

            final int resultLimit =  productItemRequest.getProductItemBulkRequestPayload().getProducts().size();

            final List<RESTBulkProduct> restBulkProducts = new ArrayList<RESTBulkProduct>();
            for (int i = INDEX_SIZE; i < resultLimit; i++) {

                ErrorContainer errorContainer = null;

                final RESTBulkProductRequest restBulkProductRequest = productItemRequest.getProductItemBulkRequestPayload().getProducts().get(i);
                //final BulkProductRequest productRequest = productItemRequest.getProductItemBulkRequestPayload().getProducts().get(i);

                if (restBulkProductRequest.getProdID() != null) {
                    if (restBulkProductRequest.getProdID().trim().equals("")) {

                        logger.error(MISSING_VALUE_PASSED_FOR_PROD_ID);
                        errorContainer = RESTProductResponseCode.getNewMissingRequiredParametersContainer();
                        errorContainer.createMessage(PROD_ID);
                    } else {

                        final RESTBulkProduct restBulkProduct = productIntegrationResponseMapper.mapBulkRESTProduct(productBulkDomainService.getProductByProdID(restBulkProductRequest.getProdID()).getBulkProduct());

                        if (restBulkProduct != null && restBulkProduct.getError() != null) {
                            errorContainer = restBulkProduct.getError();
                        } else {
                            restBulkProducts.add(restBulkProduct);
                        }
                    }
                } else {

                    errorContainer = RESTProductResponseCode.getNewMissingRequiredParametersContainer();
                    errorContainer.createMessage(PROD_ID);
                }

                if (errorContainer != null) {
                    final RESTBulkProduct restBulkProduct = new RESTBulkProduct();
                    errorContainer.setEntity(isDebug ? productItemRequest : null);
                    restBulkProduct.setError(errorContainer);

                    restBulkProducts.add(restBulkProduct);
                }
            }

            // Gets Result Size
            resultCount = restBulkProducts.size();

            final BulkProductPayload restBulkProductResponsePayload = new BulkProductPayload();
            restBulkProductResponsePayload.setProducts(restBulkProducts);
            final ResponseContainer entity = RESTProductResponseEntityBuilder.createProductItems().payload(
                    restBulkProductResponsePayload, "POST",resultCount).build();

            response = Response.ok(entity).build();

        } catch (Exception e) {

        }

        return response;
    }




    /*private RESTProduct findProductByProdId(final String ProdID) {
        return productIntegrationResponseMapper.mapProduct(productDomainService.getProductByProdID(ProdID));
    }*/
}