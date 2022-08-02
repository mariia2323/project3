package org.example;

import junit.framework.TestCase;
import org.junit.Test;


public class circleTest3 extends TestCase{
    circle calculation = new circle(4);
    double Diameter = calculation.getDiameter();
    double testDiameter = 8;

    @Test
    public void testSum2() {
        System.out.println("@Test Diameter(): " + Diameter + " = " + testDiameter);
        assertEquals(Diameter, testDiameter);
    }
}

