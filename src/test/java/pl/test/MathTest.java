package pl.test;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static pl.test.Math.getFactors;

public class MathTest {

    @Test
    public void ListSize(){
        //given
        int x;
        int y;
        int number=10;

        //when
        Factors pair1 = new Factors(1,10);
        Factors pair2 = new Factors(2,5);
        Factors pair3 = new Factors(5,2);
        Factors pair4 = new Factors(10,1);
        List <Factors> testGetFactors = new ArrayList<Factors>();
        testGetFactors.add(pair1);
        testGetFactors.add(pair2);
        testGetFactors.add(pair3);
        testGetFactors.add(pair4);
        List <Factors> getFactors= Math.getFactors(number); //to było kluczowe

        //then
        assertEquals (4,getFactors(number).size());


    }

    @Test
    public void FactorsOf10(){
        //given
        int x;
        int y;
        int number=10;

        //when
        Factors pair1 = new Factors(1,10);
        Factors pair2 = new Factors(2,5);
        Factors pair3 = new Factors(5,2);
        Factors pair4 = new Factors(10,1);
        List <Factors> testGetFactors = new ArrayList<Factors>();
        testGetFactors.add(pair1);
        testGetFactors.add(pair2);
        testGetFactors.add(pair3);
        testGetFactors.add(pair4);

        //then
        assertTrue(getFactors(number).contains(pair1));
        assertTrue(getFactors(number).contains(pair2));
        assertTrue(getFactors(number).contains(pair3));
        assertTrue(getFactors(number).contains(pair4));

    }
}
