package com.company;

import com.company.model.Query;

import javax.xml.bind.UnmarshalException;

public class Main {

    public static void main(String[] args) throws UnmarshalException {

        String response = HttpUtils.sendGet("http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20(%22USDUAH%22,%20%22USDEUR%22)&env=store://datatables.org/alltableswithkeys");
        System.out.println("response from yahoo");
        System.out.println("-----------------------");
        System.out.println(response);
        System.out.println("-----------------------");
        System.out.println();

        Query query = ParseUtils.parseYahooFinanceResponseXml(response);
        System.out.println("parsed response");
        System.out.println("-----------------------");
        System.out.println(query.toString());
        System.out.println("-----------------------");
    }
}
