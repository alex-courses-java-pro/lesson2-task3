package com.company;

import com.company.model.Query;

import javax.xml.bind.UnmarshalException;

public class Main {
private static String XML = "<query xmlns:yahoo=\"http://www.yahooapis.com/v1/base.rng\" yahoo:count=\"2\" yahoo:created=\"2017-04-16T23:52:04Z\" yahoo:lang=\"en-US\">\n" +
        "<results>\n" +
        "<rate id=\"USDUAH\">\n" +
        "<Name>USD/UAH</Name>\n" +
        "<Rate>26.8050</Rate>\n" +
        "<Date>4/16/2017</Date>\n" +
        "<Time>6:11pm</Time>\n" +
        "<Ask>27.0550</Ask>\n" +
        "<Bid>26.8050</Bid>\n" +
        "</rate>\n" +
        "<rate id=\"USDEUR\">\n" +
        "<Name>USD/EUR</Name>\n" +
        "<Rate>0.9424</Rate>\n" +
        "<Date>4/16/2017</Date>\n" +
        "<Time>11:34pm</Time>\n" +
        "<Ask>0.9429</Ask>\n" +
        "<Bid>0.9424</Bid>\n" +
        "</rate>\n" +
        "</results>\n" +
        "</query>";


    public static void main(String[] args) throws UnmarshalException {
        Query query = ParseUtils.parseYahooFinanceResponse(XML);
        System.out.println(query.toString());
    }
}
