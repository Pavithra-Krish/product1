package com.services.product.integration.models_c1.response;

import com.services.product.common_c1.request.RequestParameterSet;
import com.services.product.common_c1.response.AbstractResponseEntityBuilder;
import com.services.product.common_c1.response.ResponseContainer;
import com.services.product.integration.models_c1.RESTProduct;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Pavithra on 3/11/14.
 */
public class RESTProductResponseEntityBuilder extends AbstractResponseEntityBuilder<RESTProductResponseEntityBuilder> {


    public RESTProductResponseEntityBuilder(final ResponseContainer container) {

        super(container);
    }

    public static RESTProductResponseEntityBuilder createProductItem() {

        return new RESTProductResponseEntityBuilder(new RESTProductItemResponseContainer());
    }

    public static RESTProductResponseEntityBuilder createProductItems() {

        return new RESTProductResponseEntityBuilder(new RESTProductItemsResponseContainer());
    }

    public RESTProductResponseEntityBuilder payload(final RESTProduct product) {

        final List<RESTProduct> products = new ArrayList<RESTProduct>();
        Iterator iterator;
        if (product != null) {
            products.add(product);
        }

        final ProductsPayload payload = new ProductsPayload();
        payload.setProducts(products);
        super.offset(1);
        super.payload(payload);

        return this;
    }

    public RESTProductResponseEntityBuilder payload(final BulkProductPayload bulkProductPayload, final String limit, final int count) {


        super.offset(RequestParameterSet.PARAM_OFFSET_MIN);
        super.payload(bulkProductPayload);

        return this;
    }
}