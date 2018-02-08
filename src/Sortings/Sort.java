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
public class Sort implements Comparable{
    Integer comparable;

    @Override
    public int compareTo(Object o) {
        Integer num1 = (Integer) o;
        return comparable.compareTo(num1);
    }
    public void gnomeSort(Integer[] theArray) 
    {
        for (int index = 1; index < theArray.length;)
        {
            if (theArray[index - 1] <= theArray[index])
            {
                ++index;
            }
            else
            {
                int tempVal = theArray[index];
                theArray[index] = theArray[index - 1];
                theArray[index - 1] = tempVal;
                --index;
                if (index == 0)
                {
                    index = 1;
                }
            }
        }
    }
    public Integer[] mergeSort(Integer[] array)
    {
        int n = array.length;
        int largo =0;
        for (largo =1; largo < n; largo *= 2)
        {
            
        }
    }
    
}
