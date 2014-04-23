package com.services.product.common_c1.response;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by Pavithra on 3/11/14.
 */
public abstract class ResponseContainer<T> {

    private Integer count;
    private Integer limit;
    private Integer offset;
    private T payload;
    private List<ErrorContainer> errors;

    @XmlElement(name = "count")
    public Integer getCount() {

        return count;
    }


    public void setCount(final Integer count) {

        this.count = count;
    }

    @XmlElement(name = "error")
    public List<ErrorContainer> getErrors() {

        return this.errors;
    }

    public void setErrors(final List<ErrorContainer> errors) {

        this.errors = errors;
    }

    @XmlElement(name = "limit")
    public Integer getLimit() {

        return limit;
    }

    public void setLimit(final Integer limit) {

        this.limit = limit;
    }

    @XmlElement(name = "offset")
    public Integer getOffset() {

        return offset;
    }

    public void setOffset(final Integer offset) {
        this.offset = offset;
    }

    @XmlElement(name = "payload")
    public T getPayload() {
        return this.payload;
    }

    public void setPayload(final T payload) {
        this.payload = payload;
    }
}

