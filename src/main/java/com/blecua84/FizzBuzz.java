package com.blecua84;

/**
 * FizzBuzz Algorithm implementation.
 *
 * @author blecua84
 */
public class FizzBuzz {

    public String apply(int number) {

        String result = String.valueOf(number);

        if(number > 0) {
            if (number % 15 == 0)
                result = "FizzBuzz";
            else if(number % 3 == 0)
                result = "Fizz";
            else if(number % 5 == 0)
                result = "Buzz";
        }


        return result;
    }
}
