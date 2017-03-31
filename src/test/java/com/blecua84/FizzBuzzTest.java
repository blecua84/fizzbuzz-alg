package com.blecua84;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for FizzBuzz Algorithm.
 *
 * @author blecua84
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    private void assertFizz(int input) {
        assertEquals("Fizz", fizzBuzz.execute(input));
    }

    private void assertBuzz(int input) {
        assertEquals("Buzz", fizzBuzz.execute(input));
    }

    private void assertFizzBuzz(int input) {
        assertEquals("FizzBuzz", fizzBuzz.execute(input));
    }

    @Before
    public void setUp() throws Exception {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    public void when1return1() throws Exception {
        Assert.assertTrue(this.fizzBuzz.execute(1).equals(1));
    }

    @Test
    public void when2return2() throws Exception {
        Assert.assertTrue(this.fizzBuzz.execute(2).equals(2));
    }

    @Test
    public void whenIsFizz() throws Exception {
        assertFizz(3);
        assertFizz(6);
        assertFizz(9);
    }

    @Test
    public void when4return4() throws Exception {
        Assert.assertTrue(this.fizzBuzz.execute(4).equals(4));
    }

    @Test
    public void whenIsBuzz() throws Exception {
        assertBuzz(5);
        assertBuzz(10);
    }

    @Test
    public void when6returnFizz() throws Exception {
        assertFizz(6);
    }

    @Test
    public void when7return7() throws Exception {
        Assert.assertTrue(this.fizzBuzz.execute(7).equals(7));
    }

    @Test
    public void whenIsFizzBuzz() throws Exception {
        assertFizzBuzz(15);
        assertFizzBuzz(30);
        assertFizzBuzz(45);
    }
}