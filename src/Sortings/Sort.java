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
public class Sort implements Comparable{
    Integer comparable;
    Integer[] mergeArray;

    public Sort() {
        this.comparable = 0;
    }

    @Override
    public int compareTo(Object o) {
        Integer num1 = (Integer) o;
        return comparable.compareTo(num1); // devuelve 0 si son iguales, -1 si comparable es menor y 
        //1 si es mayor que el argumento
    }
    public Integer[] gnomeSort(Integer[] theArray) 
    {
        for (int index = 1; index < theArray.length;)
        {
            if (theArray[index - 1] <= theArray[index])
            {
                index++;
            }
            else
            {
                int tempVal = theArray[index];
                theArray[index] = theArray[index - 1];
                theArray[index - 1] = tempVal;
                index--;
                if (index == 0)
                {
                    index = 1;
                }
            }
        }
        return theArray;
    }
    public void mergeSort(Integer[] array) {
        int size = array.length;
        if (size < 2)
            return;
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
    public Integer[] getMergedArray()
    {
        return mergeArray;
    }
    
    private Integer[]listaQS;
    public Integer[] quickSort(Integer[] lista){
        listaQS=lista;
        if (listaQS==null||listaQS.length==0){
            return null;
        }else if(lista.length==1){
            return lista;
        }else{
            procesoQuicksort(0,listaQS.length-1);
            return listaQS;
        }
    }
    public void procesoQuicksort(int a,int b){
        if(a<b){
            int pivote=listaQS[b];
            int pIndex=a;
            for (int i=a;i<b;i++){
                if (listaQS[i]<=pivote){
                    int temporal=listaQS[pIndex];
                    listaQS[pIndex]=listaQS[i];
                    listaQS[i]=temporal;
                    pIndex++;
                }
            }
            int temporal=listaQS[pIndex];
            listaQS[pIndex]=listaQS[b];
            listaQS[b]=temporal;        
            procesoQuicksort(a,pIndex-1);
            procesoQuicksort(pIndex+1,b);
        }
        
    }
        
}
