/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Sortings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Ana Lucía Hernández (17138). Luis Delgado (17187)
 */
public class Principal {
    public static void main (String[] args) throws IOException
    {
        //PARA GENERAR LOS NUMEROS RANDOM
        
        Random generador = new Random();
        File logFile = new File("NumerosRandom.txt");
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(logFile));
            for (int i =0; i<3000; i++)
            {
                writer.write(String.valueOf(generador.nextInt(3001))+ "\n");
            }
        }
        finally
        {
            writer.close();
        }
        //PARA LEER LOS NUMEROS RANDOM GENERADOS
        BufferedReader br = new BufferedReader(new FileReader("NumerosRandom.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            String[] expresionSeparada = everything.split("\n");
            Integer[] list = new Integer[expresionSeparada.length];
            for (int k =0; k < expresionSeparada.length; k++)
            {
                list[k] = Integer.parseInt(expresionSeparada[k]);
            }
            //COMIENZA A REALIZAR LOS SORTINGS
            MergeSort sorting = new MergeSort();
            sorting.mergeSort(list);
            Integer[] orden = sorting.getMergedArray();
            System.out.println(String.valueOf("MERGE SORT: "));
            for(int i=0; i<orden.length;i++)
            {
                System.out.println(String.valueOf(orden[i]));
            }
            GnomeSort gnome = new GnomeSort();
            gnome.gnomeSort(list);
            Integer[] ordengnome = gnome.gnomeSort(list);
            System.out.println(String.valueOf("\nGNOME SORT: "));
            for(int i=0; i<orden.length;i++)
            {
                System.out.println(String.valueOf(ordengnome[i]));
            }
            HeapSort heap = new HeapSort();
            heap.heapSort(list);
            Integer[] ordenheap = heap.getHeapArray();
            System.out.println(String.valueOf("HEAP SORT: "));
            for(int i=0; i<orden.length;i++)
            {
                System.out.println(String.valueOf(ordenheap[i]));
            }
            QuickSort quick = new QuickSort();
            Integer[] ordenquick = quick.quickSort(list);
            System.out.println(String.valueOf("\nQUICK SORT: "));
            for(int i=0; i<orden.length;i++)
            {
                System.out.println(String.valueOf(ordenquick[i]));
            }
            RadixSort radix = new RadixSort();
            Integer[] ordenradix = radix.RadixSort(list);
            System.out.println(String.valueOf("\nRADIX SORT: "));
            for(int i=0; i<orden.length;i++)
            {
                System.out.println(String.valueOf(ordenradix[i]));
            }
        } 
        finally {
            br.close();
        }
            
    }
}
