package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        int expected = 10;
        int actual = calculator.add(5,5);
        Assert.assertEquals(expected, actual);
    }
}
