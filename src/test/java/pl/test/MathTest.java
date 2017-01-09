package pl.test;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MathTest {

    @Test
    public void getFactors_simple() {
        List<Factors> factors = Math.getFactors(10);

        assertEquals(factors.size(), 4);
        assertTrue(factors.contains(new Factors(10, 1)));
        assertTrue(factors.contains(new Factors(1, 10)));
        assertTrue(factors.contains(new Factors(2, 5)));
        assertTrue(factors.contains(new Factors(5, 2)));

//        assertEquals(factors.get(0).getX(), 1);
//        assertEquals(factors.get(0).getY(), 10);
//
//        assertEquals(factors.get(3).getX(), 10);
//        assertEquals(factors.get(3).getY(), 1);
    }


}
