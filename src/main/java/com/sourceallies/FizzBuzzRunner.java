package com.sourceallies;

import java.util.stream.IntStream;

public class FizzBuzzRunner {
    public static void main(String[] args) {
        var fizzBuzz = new FizzBuzz();

        IntStream.range(1, 100).forEach(i -> System.out.println(fizzBuzz.doTheThing(i)));
    }
}