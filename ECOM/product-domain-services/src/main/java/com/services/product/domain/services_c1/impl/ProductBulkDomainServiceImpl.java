package com.services.product.domain.services_c1.impl;

import com.services.product.domain.models_c1.Product;
import com.services.product.domain.models_c1.response.BulkProductResponse;
import com.services.product.domain.services_c1.interfaces.ProductBulkDomainService;

import java.util.List;

/**
 * Created by Pavithra on 3/12/14.
 */
public class ProductBulkDomainServiceImpl implements ProductBulkDomainService {
    private Product product = null;
    private static final String INVALIDProdID = "999";
    private static final String COLLECTIONPRODUCTProdID = "111";
    private List<Product> collectionOfProducts;
    private static final String IN_STOCK = "In Stock";

    public ProductBulkDomainServiceImpl(){
       /* collectionOfProducts = new ArrayList<Product>();
        final Product product1 = new Product();
        product1.setProdID("2345");
        product1.setBrand("Kohl's");
        product1.setStatus(IN_STOCK);
        product1.setDescription("Test product from Kohl's");




        final ProductPrice price = new ProductPrice();*/
    }

    @Override
    public BulkProductResponse getProductByProdID(String ProdID) {
        return null;
    }

  /*  private static final Logger log = LoggerFactory.getLogger(ProductBulkDomainServiceImpl.class);
   // private final ProductDomainServices productDataAccessService;

    @Inject
    public ProductBulkDomainServiceImpl(final ProductDomainServices productDataAccessService) {
        this.productDataAccessService = productDataAccessService;
    }


    @Override
    public BulkProductResponse getProductByProdID(final String ProdID){

        BulkProductResponse productResponse;

        try {
            final boolean withSkuDetail = true;

            Product product = productDataAccessService.getProductByProdID(ProdID);

            if (product == null) {
                log.error("Failed to get product with WebId {} ", ProdID);
                throw new DataServiceException("ProdId " + ProdID + " not found.");
            }

            log.debug("RESTProduct information for with WebId {}", ProdID);
           productResponse = ProductSoapRpcConverterUtil.getBulkProductResponse(product);

        } catch (Exception e) {

            log.error("Failed to get product with WebId {} ", ProdID);
          final ErrorContainer errorContainer = ProductResponseCode.getNewWebIDNotFoundContainer();
            errorContainer.createMessage(ProdID);

            final BulkProduct product = new BulkProduct();
            product.setError(errorContainer);

            productResponse = new BulkProductResponse();
            productResponse.setBulkProduct(product);

        }

        return productResponse;
    } */

}
