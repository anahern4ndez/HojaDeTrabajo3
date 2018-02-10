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
public class HeapSortTest {
    
    public HeapSortTest() {
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
     * Test of compareTo method, of class HeapSort.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object o = (int) 0;
        HeapSort instance = new HeapSort();
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
     * Test of heapSort method, of class HeapSort.
     */
    @Test
    public void testHeapSort() {
        System.out.println("heapSort");
        Integer[] arr = {9,5,2,6,3,1};
        HeapSort instance = new HeapSort();
        instance.heapSort(arr);
        Integer[] expResult = {1,2,3,5,6,9};
        Integer[] result = instance.getHeapArray();
        // TODO review the generated test code and remove the default call to fail.
        if (!Arrays.equals(result, expResult))
        {
            fail("La prueba ha fallado.");
            
        }
    }

    /**
     * Test of heapify method, of class HeapSort.
     */
    @Test
    public void testHeapify() {
        System.out.println("heapify");
        Integer[] arr = {1,3,4,5,6,7,8};
        int n = 0;
        int i = 0;
        HeapSort instance = new HeapSort();
        instance.heapify(arr, n, i);
    }

    /**
     * Test of getHeapArray method, of class HeapSort.
     */
    @Test
    public void testGetHeapArray() {
        System.out.println("getHeapArray");
        HeapSort instance = new HeapSort();
        Integer[] expResult = null;
        Integer[] result = instance.getHeapArray();
        assertArrayEquals(expResult, result);
    }
    
}
