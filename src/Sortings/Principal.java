/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sortings;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author anahernandez
 */
public class Principal {
    /**public static void main (String[] args) throws IOException
    {
        Random generador = new Random();
        File logFile = new File("");
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(logFile));
            
            writer.write("");
        }
        finally
        {
            writer.close();
        }**/
    /**
     * @param args}*
     * @throws java.io.IOException
     */
    public static void main (String[] args) throws IOException
    {
        MergeSort sorting = new MergeSort();
        Integer[] list = {9,5,2,6,3,1};
        sorting.mergeSort(list);
        Integer[] orden = sorting.getMergedArray();
        System.out.println(String.valueOf("MERGE SORT: "));
        for(int i=0; i<orden.length;i++)
        {
            System.out.println(String.valueOf(orden[i]));
        }
        GnomeSort gnome = new GnomeSort();
        gnome.gnomeSort(list);
        Integer[] ordengnome = sorting.getMergedArray();
        System.out.println(String.valueOf("GNOME SORT: "));
        for(int i=0; i<orden.length;i++)
        {
            System.out.println(String.valueOf(ordengnome[i]));
        }
        HeapSort heap = new HeapSort();
        heap.heapSort(list);
        Integer[] ordenheap = sorting.getMergedArray();
        System.out.println(String.valueOf("GNOME SORT: "));
        for(int i=0; i<orden.length;i++)
        {
            System.out.println(String.valueOf(ordenheap[i]));
        }
    }
}
