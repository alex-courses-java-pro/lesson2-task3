package com.company.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by arahis on 4/17/17.
 */
public class Rate {
    private String id;
    private String name;
    private String date;
    private String time;
    private String ask;
    private String bid;

    public Rate() {
    }

    public Rate(String id, String name, String date, String time, String ask, String bid) {
        super();
        this.id = id;
        this.name = name;
        this.date = date;
        this.time = time;
        this.ask = ask;
        this.bid = bid;
    }

    @XmlAttribute
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", ask='" + ask + '\'' +
                ", bid='" + bid + '\'' +
                '}';
    }
}
