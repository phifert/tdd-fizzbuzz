package com.sourceallies;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void givenANumberShouldReturnThatNumber() {
        var expectedResult = 1;
        var fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.doTheThing(1);

        assertThat(result).isEqualTo(expectedResult);
    }
}
