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
public class GnomeSort {
    
    public Integer[] theArray;
    private Integer comparable =0;
    
    public GnomeSort()
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
    
}
