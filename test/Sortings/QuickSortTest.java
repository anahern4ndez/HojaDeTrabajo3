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
public class QuickSortTest {
    
    public QuickSortTest() {
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
        QuickSort instance = new QuickSort();
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
     * Test of quickSort method, of class Sort.
     */
    @Test
    public void testQuickSort() {
        System.out.println("quickSort");
        Integer[] lista = {9,5,2,6,3,1};
        QuickSort instance = new QuickSort();
        Integer[] expResult = {1,2,3,5,6,9};
        Integer[] result = instance.quickSort(lista);
        assertArrayEquals(expResult, result);
        if (!Arrays.equals(result, expResult))
        {
            fail("La prueba ha fallado");
            
        }
    }

    /**
     * Test of procesoQuicksort method, of class Sort.
     */
    @Test
    public void testProcesoQuicksort() {
        System.out.println("procesoQuicksort");
        int a = 0;
        int b = 0;
        QuickSort instance = new QuickSort();
        instance.procesoQuicksort(a, b);
    }
    
}
