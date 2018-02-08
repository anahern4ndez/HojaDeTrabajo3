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
    public int[] mergeSort(int[] array)
    {
        int n = array.length;
        int[] arrayNuevo = new int[n];
        int mitad = n/2;
        if (n >1)
        {
            int[] primeraMitad = new int[(int)mitad];
            int[] segundaMitad = new int[(int)mitad];
            this.mergeSort(primeraMitad);
            this.mergeSort(segundaMitad);
            int i=0, j=0, k=0;
            while ((i<primeraMitad.length) &&(j<segundaMitad.length))
            {
                
                if (primeraMitad[i] < segundaMitad[j])
                {
                    arrayNuevo[k] = primeraMitad[i];
                    i++;
                }
                else
                {
                    arrayNuevo[k] = segundaMitad[j];
                    j++;
                }
                k++;
            }
            while(i < primeraMitad.length)
            {
                arrayNuevo[k] = primeraMitad[i];
                i++;
                k++;
            }
            while (j < segundaMitad.length)
            {
                arrayNuevo[k] = segundaMitad[j];
                j++;
                k++;
            }
        }
        return arrayNuevo;
    }
    
    private int[] listaQS;
    public int[] quickSort(int[] lista){
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
