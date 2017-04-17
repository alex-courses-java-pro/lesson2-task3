package com.company.model;


import java.util.Arrays;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by arahis on 4/17/17.
 */
@XmlRootElement(name = "query")
@XmlAccessorType(XmlAccessType.FIELD)
public class Query {

    @XmlAttribute(name = "count", namespace = "http://www.yahooapis.com/v1/base.rng")
    private int count;
    @XmlAttribute(name = "created", namespace = "http://www.yahooapis.com/v1/base.rng")
    private String created;
    @XmlAttribute(name = "lang", namespace = "http://www.yahooapis.com/v1/base.rng")
    private String lang;
    @XmlElementWrapper(name="results")
    @XmlElement(name = "rate")
    private Rate[] rates;

    public Query() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Rate[] getRates() {
        return rates;
    }

    public void setRates(Rate[] rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "Query{" +
                "count=" + count +
                ", created='" + created + '\'' +
                ", lang='" + lang + '\'' +
                ", rates=" + Arrays.toString(rates) +
                '}';
    }
}
