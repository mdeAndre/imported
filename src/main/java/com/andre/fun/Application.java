package com.andre.fun;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Khemraev Andre on 10/31/16.
 */
public class Application {

    public static void main(String[] args) {
        //sample
        String string = Stream.of("I", "do", "want", "to", "be", "a", "git", "guru!").collect(Collectors.joining(" "));
        System.out.println(string);
    }
}
