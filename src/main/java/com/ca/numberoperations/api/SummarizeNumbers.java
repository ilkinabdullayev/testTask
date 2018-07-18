package com.ca.numberoperations.api;

import com.ca.numberoperations.exceptions.LimitException;

public interface SummarizeNumbers {
    Integer sum(Integer a, Integer b) throws LimitException;
}
