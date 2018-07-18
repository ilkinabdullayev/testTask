package com.ca.numberoperations.impl;

import com.ca.numberoperations.exceptions.LimitException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SummarizeNumbersImplTest {

    private SummarizeNumbersImpl summarizeNumbers;

    @Before
    public void setup(){
        summarizeNumbers = new SummarizeNumbersImpl();
    }


    @Test
    public void givenTwoNumber_whenSumNumberIsPositive_thenCorrect(){
        int actual = summarizeNumbers.sum(3 ,5);
        int expected = 8;

        assertEquals(expected,actual);
    }

    @Test(expected = LimitException.class)
    public void givenTwoNumber_whenSumNumberExceedMaxLimit_thenLimitException(){
        int number1 = Integer.MAX_VALUE - 8;
        int number2 = 10;
        summarizeNumbers.sum(number1 ,number2);
    }


    @Test
    public void givenTwoNumber_whenSumNumberIsNegative_thenCorrect(){
        int actual = summarizeNumbers.sum(3 ,-5);
        int expected = -2;

        assertEquals(expected,actual);
    }

    @Test(expected = LimitException.class)
    public void givenTwoNumber_whenSumNumberExceedMinLimit_thenLimitException(){
        int number1 = Integer.MIN_VALUE + 8;
        int number2 = -10;
        summarizeNumbers.sum(number1 ,number2);
    }

    @Test
    public void givenTwoNumber_whenSumNumberIsZero_thenCorrect(){
        int actual = summarizeNumbers.sum(4 ,-4);
        int expected = 0;

        assertEquals(expected,actual);
    }
}
