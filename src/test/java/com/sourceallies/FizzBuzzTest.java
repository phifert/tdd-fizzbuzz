package com.sourceallies;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void givenANumberShouldReturnThatNumber() {
        var expectedResult = "1";
        var fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.doTheThing(1);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void givenTwoShouldReturnTwo() {
        var expectedResult = "2";
        var fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.doTheThing(2);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void givenThreeShouldReturnFizz() {
        var expectedResult = "Fizz";
        var fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.doTheThing(3);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void givenFiveShouldReturnBuzz() {
        var expectedResult = "Buzz";
        var fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.doTheThing(5);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void givenSixShouldReturnFizz() {
        var expectedResult = "Fizz";
        var fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.doTheThing(6);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void givenTenShouldReturnBuzz() {
        var expectedResult = "Buzz";
        var fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.doTheThing(10);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void givenFifteenShouldReturnFizzBuzz() {
        var expectedResult = "FizzBuzz";
        var fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.doTheThing(15);

        assertThat(result).isEqualTo(expectedResult);
    }

}
