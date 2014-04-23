/*
package com.services.product.common_c1.unmarshal;

import com.services.product.common_c1.Exceptions.InvalidJSONException;
import com.services.product.common_c1.Exceptions.InvalidJSONFieldException;
import com.services.product.common_c1.Exceptions.InvalidXMLException;
import com.services.product.common_c1.Exceptions.PayloadException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.exc.UnrecognizedPropertyException;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;


public class UnMarshallerUtil {

    private static final ObjectMapper JSON_MAPPER = new ObjectMapper();

    public static <T> T unmarshall(final Class clazz, final String input, final String contentType) throws Exception { //NOPMD

        if (contentType.contains(MediaType.APPLICATION_XML.toString())) {

            return UnMarshallerUtil.<T>unmarshallXMLNew(clazz, input);
        }
        else if (contentType.contains(MediaType.APPLICATION_JSON.toString())) {

            return UnMarshallerUtil.<T>unmarshallJSON(clazz, input);
        }
        else {

            return null;
        }
    }

    public static <T> T unmarshallXML(final Class clazz, final String xml) throws Exception { //NOPMD

        final JAXBContext context = JAXBContext.newInstance(clazz);
        final Unmarshaller unmarshaller = context.createUnmarshaller();
        final T bo = (T) unmarshaller.unmarshal(new StringReader(xml));

        return bo;
    }

    private static <T> T unmarshallXMLNew(final Class clazz, final String xml) throws PayloadException {

        T bo;

        try {

            final JAXBContext context = JAXBContext.newInstance(clazz);
            final Unmarshaller unmarshaller = context.createUnmarshaller();
            bo = (T) unmarshaller.unmarshal(new StringReader(xml));
        }
        catch (Exception exception) {

            throw new InvalidXMLException(null, exception.getMessage()); //NOPMD
        }

        return bo;
    }

    private static <T> T unmarshallJSON(final Class clazz, final String json) throws PayloadException {

        T bo = null;

        try{

            bo = (T) JSON_MAPPER.readValue(json, clazz);
        }
        catch (UnrecognizedPropertyException exception) {

            throw new InvalidJSONFieldException(null, exception.getUnrecognizedPropertyName()); //NOPMD
        }
        catch (Exception exception) {

            throw new InvalidJSONException(null, exception.getMessage()); //NOPMD
        }

        return bo;
    }
}
*/
