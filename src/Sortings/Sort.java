/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sortings;

/**
 *
 * @author anahernandez
 */
public class Sort {
    private int[] listaQS;
    public Sort(){
        
    }
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
