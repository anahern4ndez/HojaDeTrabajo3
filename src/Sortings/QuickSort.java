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
public class QuickSort {
    
    private Integer[]listaQS;
    private Integer comparable;
    
    public QuickSort()
    {
        comparable =0;
    }
    /**
     * 
     * @param o: objeto con el cual se desea comparar la instancia. 
     * @return devuelve 0 si son iguales, -1 si comparable es menor y 1 si es mayor que el argumento
     */
    public int compareTo(Object o) {
        Integer num1 = (Integer) o;
        return comparable.compareTo(num1); // devuelve 0 si son iguales, -1 si comparable es menor y 
        //1 si es mayor que el argumento
    }

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
    /**
     * 
     * @param a
     * @param b 
     */
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
