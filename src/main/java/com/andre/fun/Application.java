package com.andre.fun;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Khemraev Andre on 10/31/16.
 */
public class Application {

    private static MessageSupplier supplier = new MessageSupplier();

    public static void main(String[] args) {
        System.out.println(supplier.supply());
    }
}
