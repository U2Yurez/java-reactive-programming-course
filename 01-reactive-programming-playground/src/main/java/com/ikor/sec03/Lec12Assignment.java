package com.ikor.sec03;


import com.ikor.common.Util;
import com.ikor.sec03.assignment.StockPriceObserver;
import com.ikor.sec03.client.ExternalServiceClient;

/*
    Ensure that the external service is up and running!
 */
public class Lec12Assignment {

    public static void main(String[] args) {

        var client = new ExternalServiceClient();
        var subscriber = new StockPriceObserver();
        client.getPriceChanges()
                .subscribe(subscriber);


        Util.sleepSeconds(20);

    }

}
