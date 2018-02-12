/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Sortings;

/**
 *
 * @author Ana Lucía Hernández (17138). Luis Delgado (17187)
 */
public class MergeSort {
    
    private Integer comparable;
    private Integer[] mergeArray;
    
    public MergeSort()
    {
        comparable = 0;
    }
            
    /**
     * 
     * @param o: objeto con el cual se desea comparar la instancia. 
     * @return devuelve 0 si son iguales, -1 si comparable es menor y 1 si es mayor que el argumento
     */
    public int compareTo(Object o) {
        Integer num1 = (Integer) o;
        return comparable.compareTo(num1);
    }
    
    /**
     * 
     * @param array: array de números enteros a ordenar. 
     */
    public void mergeSort(Integer[] array) {
        int size = array.length;
        if (size < 2)
        {
            return;
        }
        else
        {
            int mitad = size / 2;
            int leftSize = mitad;
            int rightSize = size - mitad;
            Integer[] primeraMitad = new Integer[leftSize];
            Integer[] segundaMitad = new Integer[rightSize];
            for (int i = 0; i < mitad; i++) {
                primeraMitad[i] = array[i];

            }
            for (int i = mitad; i < size; i++) {
                segundaMitad[i - mitad] = array[i];
            }
            mergeSort(primeraMitad);
            mergeSort(segundaMitad);

            int leftSize2 = primeraMitad.length;
            int rightSize2 = segundaMitad.length;
            int i = 0, j = 0, k = 0;
            while (i < leftSize2 && j < rightSize2) {
                if (primeraMitad[i] <= segundaMitad[j]) {
                    array[k] = primeraMitad[i];
                    i++;
                    k++;
                } else {
                    array[k] = segundaMitad[j];
                    k++;
                    j++;
                }
            }
            while (i < leftSize2) {
                array[k] = primeraMitad[i];
                k++;
                i++;
            }
            while (j < leftSize2) {
                array[k] = segundaMitad[j];
                k++;
                j++;
            }
            mergeArray = array;
        }
    }
    /**
     * 
     * @return la lista de números ingresada, ya ordenada. 
     */
    public Integer[] getMergedArray()
    {
        return mergeArray;
    }
}
