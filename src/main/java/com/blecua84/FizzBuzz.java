package com.blecua84;

/**
 * FizzBuzz Algorithm implementation.
 *
 * @author blecua84
 */
public class FizzBuzz {

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    public Object execute(int number) {
        if(isFizz(number) && isBuzz(number)) return "FizzBuzz";
        if(isFizz(number)) return "Fizz";
        if(isBuzz(number)) return "Buzz";
        else return number;
    }
}
