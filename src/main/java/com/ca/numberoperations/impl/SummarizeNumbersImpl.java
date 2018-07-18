package com.ca.numberoperations.impl;

import com.ca.numberoperations.api.SummarizeNumbers;
import com.ca.numberoperations.exceptions.LimitException;

public class SummarizeNumbersImpl implements SummarizeNumbers {

    /**
     * Adds two integers together as per the + operator.
     *
     * @param a the first operand
     * @param b the second operand
     * @return the sum of {@code a} and {@code b}
     * @exception  LimitException  if number's sum exceed
     *                   Integer.MAX_VALUE or Integer.MAX_VALUE,
     */
    @Override
    public Integer sum(Integer a, Integer b) throws LimitException {
        if(a > 0 && b > 0){
            int maxVal = Integer.MAX_VALUE;
            if (maxVal - a < b) {
                throw new LimitException("Your numbers sum exceed limit");
            }
        }

        if(a < 0 && b < 0){
            int minVal = Integer.MIN_VALUE;
            if (minVal - a > b) {
                throw new LimitException("Your numbers sum exceed limit");
            }
        }


        return a + b;
    }
}
