package com.services.product.common_c1.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.regex.Matcher;

/**
 * Created by Pavithra on 3/11/14.
 */
@XmlRootElement(name = "error")
public class ErrorContainer<T> {

    private static final String REGEX_CARET_GROUP = "<[^>]*>";
    private static final String REGEX_BRACKET_GROUP = "[{][^}]*[}]";
    private static final String REGEX_SINGLE_BRACKET = "[{}]";
    private static final String REGEX_DOLLAR_SIGN = "\\$";
    private static final String REGEX_BACKSLASH = "\\\\";
    private static final String HTML_CODE_DOLLAR_SIGN = "&#36;";
    private static final String HTML_CODE_BACKSLASH = "&#92;";
    private static final String EMPTY = "";

    private String code;
    private String message;
    private String invalidField;
    private String invalidValue;
    private T entity;

    public ErrorContainer() {

    }

    public ErrorContainer(final ErrorContainer other) {

        this.code = other.getCode();
        this.message = other.getMessage();
        this.invalidField = other.getInvalidField();
        this.invalidValue = other.getInvalidValue();
        this.entity = (T) other.getEntity();
    }

    public ErrorContainer(final String code, final String message) {

        this.code = code;
        this.message = message;
    }

    public ErrorContainer(final String code, final String message, final String invalidField, final String invalidValue) {

        this.code = code;
        this.message = message;
        this.invalidField = invalidField;
        this.invalidValue = invalidValue;

    }

    @XmlElement(name = "code")
    public String getCode() {

        return code;
    }

    public void setCode(final String code) {

        this.code = code;
    }

    @XmlElement(name = "message")
    public String getMessage() {

        return message;
    }

    public void setMessage(final String message) {

        this.message = message;
    }

    @XmlElement(name = "invalidField")
    public String getInvalidField() {
        return invalidField;
    }

    public void setInvalidField(final String invalidField) {
        this.invalidField = invalidField;
    }

    @XmlElement(name = "invalidValue")
    public String getInvalidValue() {
        return invalidValue;
    }

    public void setInvalidValue(final String invalidValue) {
        this.invalidValue = invalidValue;
    }

    public void createMessage(final String messageParameter) {

        if (messageParameter != null && this.message != null) {

            final String newMessageParameter = Matcher.quoteReplacement(messageParameter);

            this.message = this.message.replaceFirst(REGEX_CARET_GROUP, newMessageParameter);
        }
    }

    public void createMessage(final String[] messageParameters) {

        for (String messageParameter : messageParameters) {

            createMessage(messageParameter);
        }
    }

    public void createMessage(final List<String> messageParameters) {

        for (String messageParameter : messageParameters) {

            createMessage(messageParameter);
        }
    }

    public void createSALMessage(final String messageParameter) {

        if (messageParameter != null) {

            //Escape/Remove special characters
            String cleanedParameter = messageParameter.replaceAll(REGEX_SINGLE_BRACKET, EMPTY);
            cleanedParameter = cleanedParameter.replaceAll(REGEX_DOLLAR_SIGN, HTML_CODE_DOLLAR_SIGN);
            cleanedParameter = cleanedParameter.replaceAll(REGEX_BACKSLASH, HTML_CODE_BACKSLASH);

            //Insert cleaned parameter
            this.message = this.message.replaceFirst(REGEX_BRACKET_GROUP, cleanedParameter);

            //Replace special characters
            this.message = this.message.replaceAll(HTML_CODE_DOLLAR_SIGN, REGEX_DOLLAR_SIGN);
            this.message = this.message.replaceAll(HTML_CODE_BACKSLASH, REGEX_BACKSLASH);
        }
    }

    public void createSALMessage(final List<String> messageParameters) {

        for (String messageParameter : messageParameters) {

            createSALMessage(messageParameter);
        }
    }

    @XmlElement(name = "entity")
    public T getEntity() {

        return this.entity;
    }

    public void setEntity(final T entity) {

        this.entity = entity;
    }
}