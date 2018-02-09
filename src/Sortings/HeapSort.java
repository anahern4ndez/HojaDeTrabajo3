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
public class HeapSort {
    private Integer[] arrayHeap;
    private Integer comparable;
    
    public HeapSort()
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
    
}
