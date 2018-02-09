/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sortings;

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
            int mid = size / 2;
            int leftSize = mid;
            int rightSize = size - mid;
            Integer[] left = new Integer[leftSize];
            Integer[] right = new Integer[rightSize];
            for (int i = 0; i < mid; i++) {
                left[i] = array[i];

            }
            for (int i = mid; i < size; i++) {
                right[i - mid] = array[i];
            }
            mergeSort(left);
            mergeSort(right);

            int leftSize2 = left.length;
            int rightSize2 = right.length;
            int i = 0, j = 0, k = 0;
            while (i < leftSize2 && j < rightSize2) {
                if (left[i] <= right[j]) {
                    array[k] = left[i];
                    i++;
                    k++;
                } else {
                    array[k] = right[j];
                    k++;
                    j++;
                }
            }
            while (i < leftSize2) {
                array[k] = left[i];
                k++;
                i++;
            }
            while (j < leftSize2) {
                array[k] = right[j];
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
