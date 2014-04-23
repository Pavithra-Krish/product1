package com.services.product.common_c1.request;

/**
 * Created by Pavithra on 3/11/14.
 */
public final class RequestParameterSet {

    public static final String HEADER_REQUEST_ID = "requestID";
    public static final String HEADER_USER_ID = "userId";
    public static final String HEADER_EMAIL_ID = "email";

    public static final String PARAM_LANG = "lang";
    public static final String PARAM_LIMIT = "limit";
    public static final String PARAM_CATEGORY_LIMIT = "categoryLimit";
    public static final String PARAM_CATALOG_LIMIT = "catalog";
    public static final String PARAM_CATEGORY_NAME = "category";
    public static final String PARAM_LOC = "loc";

    public static final String PARAM_OFFSET = "offset";
    public static final String PARAM_COUNT = "count";
    public static final String PARAM_SORT_ID = "sortID";
    public static final String PARAM_KEYWORD = "keyword";

    public static final String PARAM_SIZE = "size";
    public static final String PARAM_SORT = "sort";
    public static final String PARAM_DEBUG = "debug";
    public static final String PARAM_SHIP_ADDRESSID = "shipAddressID";
    public static final String PARAM_SHIP_PREFERRED = "preferredAddr";
    public static final String PARAM_PREFERRED_PAYMENT = "false";
    public static final String PARAM_PAYMENT_ID = "paymentTypeID";
    public static final String PARAM_EMAIL = "email";

    public static final String PARAM_ACTION_ADD = "add";
    public static final String PARAM_ACTION_UPDATE = "update";
    public static final String PARAM_USER_ID = "userId";
    public static final String PARAM_POSTAL_CODE = "postalCode";
    public static final String PARAM_ORDER_NUMBER = "orderNumber";
    public static final String PARAM_STORE_NUMBER = "storeNum";

    public static final String CONTENT_TYPE = "Content-Type";

    //Constants for default values
    public static final String PARAM_LANG_DEFAULT = "en";
    public static final String PARAM_LOC_DEFAULT = "US";
    public static final String PARAM_DEBUG_DEFAULT = "false";
    public static final String PARAM_SKUDETAIL_DEFAULT = "false";
    public static final String PARAM_LIMIT_DEFAULT = "96";
    public static final String PARAM_OFFSET_DEFAULT = "1";
    public static final String PARAM_MINPRICE_DEFAULT = "0";
    public static final String PARAM_MAXPRICE_DEFAULT = "0";
    public static final String PARAM_ALL_SKUS_DEFAULT = "false";
    public static final String PARAM_SORT_ID_DEFAULT = "0";

    //Constants for ranges and default values for when ranges are passed
    public static final int PARAM_LIMIT_MAX = 100;
    public static final int PARAM_LIMIT_MIN = 1;
    public static final int PARAM_LIMIT_DEFAULT_ABOVE = 100;
    public static final int PARAM_LIMIT_DEFAULT_BELOW = 100;
    public static final int PARAM_OFFSET_MIN = 1;
    public static final int PARAM_OFFSET_DEFAULT_BELOW = 1;
    public static final String PARAM_CATALOG_LIMIT_MAX = "96";

    public static final String PARAM_CHANNEL = "channel";
    public static final String PARAM_CHANNEL_DEFAULT = "WEB";
    public static final String PARAM_CHANNEL_ID = "channelId";
    public static final String PARAM_CHANNEL_ID_DEFAULT = "";

    public static final String PARAM_PRODUCT = "product";
    public static final Integer RECOMMENDATION_LIMIT = 100;
    public static final String PARAM_RECOMMENDATION_LIMIT = "recommendation";
    public static final String PARAM_RECOMMENDATION_DFAULT_LIMIT = "recommendationdefault";
    public static final Integer PARAM_RECOMMENDATION_DEFAULT_LIMIT = 5;
    public static final String PARAM_RECOMMENDATION_CATEGORIESLIMIT = "topcategoriestrendingmax";

    public static final String PARAM_OFFER_ID = "offerId";
    public static final String PARAM_OFFER_CODE = "offerCode";

    public static final String PARAM_LOYALTY_ID = "loyaltyId";

    public static final String SYSTEM_TIME_OVERRIDE = "systemTimeOverride";

    public static final int UPC_LENGTH = 12;

    public static final String DISPLAY_OFFERS = "displayOffers";
    public static final String DISPLAY_OFFERS_DEFAULT = "false";

    public static final String CART = "cart";
}
