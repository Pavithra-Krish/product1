package com.services.product.integration.models_c1.response;

import com.services.product.common_c1.response.ErrorContainer;

/**
 * Created by Pavithra on 3/12/14.
 */
public class RESTProductResponseCode {

    private static final ErrorContainer MissingRequiredParameters = new ErrorContainer("PROD1000", "Missing Required Parameter <PARAMETER NAME>.");
    private static final ErrorContainer InvalidParameter = new ErrorContainer("PROD1001", "<PARAMETER NAME> is not a valid parameter.");
    private static final ErrorContainer InvalidParameterValue = new ErrorContainer("PROD1002", "Invalid value passed for <PARAMETER NAME>.");
    private static final ErrorContainer ProdIDNotFound = new ErrorContainer("PROD2000", "Prod ID (<Prod ID>) not found.");
    private static final ErrorContainer ProductBulkLimitExceeded = new ErrorContainer("PROD2003", "Prod ID out of bounds.Limit for ProdID combination is <current config>.");

    public static ErrorContainer getNewMissingRequiredParametersContainer() {
        return new ErrorContainer(MissingRequiredParameters);
    }

    public static ErrorContainer getNewInvalidParameterContainer() {
        return new ErrorContainer(InvalidParameter);
    }

    public static ErrorContainer getNewInvalidParameterValueContainer() {
        return new ErrorContainer(InvalidParameterValue);
    }

    public static ErrorContainer getNewProdIDNotFoundContainer() {
        return new ErrorContainer(ProdIDNotFound);
    }


    public static ErrorContainer getProductBulkLimitExceededContainer() {
        return new ErrorContainer(ProductBulkLimitExceeded);
    }

}
