package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class circleTest2 extends TestCase {
    circle calculation = new circle(3);
    double Leng = calculation.getLenght();
    double testLeng = 18.84;
    @Test
    public void testSum2() {
        System.out.println("@Test Leng(): " + Leng + " = " + testLeng );
        assertEquals(Leng, testLeng);
    }


}