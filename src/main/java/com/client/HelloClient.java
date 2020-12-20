package com.client;

import com.spi.HelloProvider;
import com.spi.HelloProviderServiceFactory;

/**
 * @author XJ
 */
public class HelloClient {
    public static void main(String[] args) {
        HelloProvider helloProvider = HelloProviderServiceFactory.providers(true).next();
        helloProvider.play();
    }
}
