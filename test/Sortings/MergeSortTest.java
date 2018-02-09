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
public class MergeSortTest {
    
    public MergeSortTest() {
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
        MergeSort instance = new MergeSort();
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
     * Test of mergeSort method, of class Sort.
     */
    @Test
    public void testMergeSort() {
        System.out.println("mergeSort");
        Integer[] array = {9,5,2,6,3,1};
        MergeSort instance = new MergeSort();
        instance.mergeSort(array);
        Integer[] expResult = {1,2,3,5,6,9};
        Integer[] result = instance.getMergedArray();
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

    /**
     * Test of getMergedArray method, of class Sort.
     */
    @Test
    public void testGetMergedArray() {
        System.out.println("getMergedArray");
        MergeSort instance = new MergeSort();
        Integer[] expResult = null;
        Integer[] result = instance.getMergedArray();
        assertArrayEquals(expResult, result);
        
    }
}
