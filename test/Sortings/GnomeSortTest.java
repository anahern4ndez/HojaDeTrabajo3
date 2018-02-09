/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sortings;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anahernandez
 */
public class GnomeSortTest {
    
    public GnomeSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of compareTo method, of class Sort.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object o = (int) 0;
        GnomeSort instance = new GnomeSort();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult)
        {
            fail("La prueba ha fallado.");
        }
    }

    /**
     * Test of gnomeSort method, of class Sort.
     */
    @Test
    public void testGnomeSort() {
        System.out.println("gnomeSort");
        Integer[] theArray = {5,8,2,6,3};
        GnomeSort instance = new GnomeSort();
        Integer[] expResult = {2,3,5,6,8};
        Integer[] result = instance.gnomeSort(theArray);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!Arrays.equals(result, expResult))
        {
            String hilo ="";
            for (int i=0; i<result.length;i++)
            {
                hilo += String.valueOf(result[i]) + " ";
            }
            fail(hilo);
            
        }
    }
    
}
