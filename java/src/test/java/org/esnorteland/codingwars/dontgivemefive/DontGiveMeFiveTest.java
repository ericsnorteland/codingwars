package org.esnorteland.codingwars.dontgivemefive;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DontGiveMeFiveTest {

    @Test
    public void smallTest() {
        assertEquals(8, DontGiveMeFive.dontGiveMeFive(1,9));
    }

    @Test
    public void biggerTest() {
        assertEquals(12, DontGiveMeFive.dontGiveMeFive(4,17));
    }

    @Test
    public void negativeTest() {
        assertEquals(6, DontGiveMeFive.dontGiveMeFive(-10, -4));
    }
}
