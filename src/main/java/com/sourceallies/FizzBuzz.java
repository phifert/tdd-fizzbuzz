package com.sourceallies;

public class FizzBuzz {
    public String doTheThing(int number) {
        var result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }

        if (number % 5 == 0) {
            result += "Buzz";
        }

        if (number % 5 != 0 && number % 3 != 0) {
            result += number;
        }

        return result;
    }
}
