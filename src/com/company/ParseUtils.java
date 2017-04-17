package com.company;

import com.company.model.Query;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;

/**
 * Created by arahis on 4/17/17.
 */
public class ParseUtils {

    public static Query parseYahooFinanceResponse(String xml) throws UnmarshalException {
        Query query = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Query.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            query = (Query) jaxbUnmarshaller.unmarshal(reader);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (query == null) throw new UnmarshalException("cannot parse xml");

        return query;
    }
}
