package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class circleTest extends TestCase {


    circle calculation = new circle(2);
    double Squar = calculation.getSquare();
    double testSquar = 12.56;
    @Test
    public void testSum1() {
        System.out.println("@Test Squar(): " + Squar + " = " + testSquar );
        assertEquals(Squar, testSquar);
    }


}