package com.services.product.common_c1.response;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavithra on 3/11/14.
 */
public abstract class AbstractResponseEntityBuilder<T extends AbstractResponseEntityBuilder> {
    protected ResponseContainer responseContainer;
   // private static final Logger log = LoggerFactory.getLogger(AbstractResponseEntityBuilder.class);

    protected AbstractResponseEntityBuilder(final ResponseContainer container) {
        responseContainer = container;
    }

    /**
     * Adds a single error to the list of errors in the Response Container
     *
     * @param error Error to add
     * @return The builder instance
     */
    public T addError(final ErrorContainer error) {

        if (responseContainer.getErrors() == null) {
            responseContainer.setErrors(new ArrayList<ErrorContainer>());
        }

        responseContainer.getErrors().add(error);

        return (T) this;
    }

    /**
     * Adds a list of errors to the Response Container
     *
     * @param errors
     * @return The builder instance
     */
    public T addErrors(final List<ErrorContainer> errors) {

        if (responseContainer.getErrors() == null) {
            responseContainer.setErrors(errors);
        }else {
            responseContainer.getErrors().addAll(errors);
        }

        return (T) this;
    }

    /**
     * Sets the index of the first object returned in the payload
     *
     * @param offset
     * @return The builder instance
     */
    public T offset(final Integer offset) {

        responseContainer.setOffset(offset);
        return (T) this;
    }

    /**
     * The main body of the response
     *
     * @param payload
     * @return The builder instance
     */
    public T payload(final Object payload) {

        responseContainer.setPayload(payload);

        return (T) this;
    }

    /**
     * Build the response container using the parameters specified
     *
     * @return
     */
    public ResponseContainer build() {

     //   log.debug("Building the ResponseContainer");
        return this.responseContainer;
    }


}
