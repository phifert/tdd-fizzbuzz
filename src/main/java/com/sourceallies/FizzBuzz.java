package com.sourceallies;

public class FizzBuzz {
    public String doTheThing(int number) {
        var result = "";

        if (number % 3 == 0 && number % 5 == 0) {
            result += "FizzBuzz";
        } else if (number % 3 == 0) {
            result += "Fizz";
        } else if (number % 5 == 0) {
            result += "Buzz";
        } else {
            result += number;
        }

        return result;
    }
}
