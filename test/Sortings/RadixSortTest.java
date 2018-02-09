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
public class RadixSortTest {
    
    public RadixSortTest() {
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
     * Test of compareTo method, of class RadixSort.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object o = 0;
        RadixSort instance = new RadixSort();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        if (result != expResult)
        {
            fail("La prueba ha fallado.");
        }
    }

    /**
     * Test of RadixSort method, of class RadixSort.
     */
    @Test
    public void testRadixSort() {
        System.out.println("RadixSort");
        Integer[] lista = null;
        RadixSort instance = new RadixSort();
        Integer[] expResult = null;
        Integer[] result = instance.RadixSort(lista);
        assertArrayEquals(expResult, result);
        if (!Arrays.equals(result, expResult))
        {
            fail("La prueba ha fallado");
            
        }
    }
    
}
