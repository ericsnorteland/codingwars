package org.esnorteland.multiply;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MultiplyTest {

    @Test
    public void sanityTest() {
        Double a = 5.0;
        Double b = 6.0;
        Double ans = a * b;
        assertEquals(ans, Multiply.multiply(a, b));
    }
    @Test
    public void testNullA() {
        assertNull(Multiply.multiply(null, 5.0));
    }
    @Test
    public void testNullB() {
        assertNull(Multiply.multiply(5.0, null));
    }
    @Test
    public void testNullAB() {
        assertNull(Multiply.multiply(null, null));
    }
}