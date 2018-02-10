/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sortings;

import java.util.ArrayList;

/**
 *
 * @author Ana Lucía Hernández (17138). Luis Delgado (17187)
 */
public class RadixSort {
    
    private Integer comparable =0;
    
    public RadixSort()
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
        return comparable.compareTo(num1); // devuelve 0 si son iguales, -1 si comparable es menor y 
        //1 si es mayor que el argumento
    }
    /**
     * Método que realiza el ordenamiento de los elementos de un arregle mediante el método RadixSort
     * @param lista
     * @return 
     */
    public Integer[] RadixSort(Integer[] lista){
        if (lista==null||lista.length==0){
            return null;
        }else if(lista.length==1){
            return lista;
        }else{
            ArrayList<Integer> bucket0 = new ArrayList<>();
            ArrayList<Integer> bucket1 = new ArrayList<>();
            ArrayList<Integer> bucket2 = new ArrayList<>();
            ArrayList<Integer> bucket3 = new ArrayList<>();
            ArrayList<Integer> bucket4 = new ArrayList<>();
            ArrayList<Integer> bucket5 = new ArrayList<>();
            ArrayList<Integer> bucket6 = new ArrayList<>();
            ArrayList<Integer> bucket7 = new ArrayList<>();
            ArrayList<Integer> bucket8 = new ArrayList<>();
            ArrayList<Integer> bucket9 = new ArrayList<>();
            int cantDigitos=0;
            int mayor_num=0;
            for (int i=0;i<=lista.length-1;i++){
                if (lista[i]>mayor_num){
                    mayor_num=lista[i];
                }
            }
            boolean r=true;
            int potencia=0;
            while (r==true){
                if(((int)(mayor_num/(Math.pow(10, potencia))))!=0){
                    potencia+=1;
                }else{
                    r=false;
                }
            }
            for (int i=0;i<=potencia;i++){
                for (int l=0;l<lista.length;l++){
                    
                    int ubicacion=(int)(lista[l]%(Math.pow(10, i+1)))/(int)Math.pow(10, i);
                    if (ubicacion==0){
                        bucket0.add(lista[l]);
                    }else if (ubicacion==1){
                        bucket1.add(lista[l]);
                    }else if (ubicacion==2){
                        bucket2.add(lista[l]);
                    }else if (ubicacion==3){
                        bucket3.add(lista[l]);
                    }else if (ubicacion==4){
                        bucket4.add(lista[l]);
                    }else if (ubicacion==5){
                        bucket5.add(lista[l]);
                    }else if (ubicacion==6){
                        bucket6.add(lista[l]);
                    }else if (ubicacion==7){
                        bucket7.add(lista[l]);
                    }else if (ubicacion==8){
                        bucket8.add(lista[l]);
                    }else if (ubicacion==9){
                        bucket9.add(lista[l]);
                    }
                }
                int contadorInts=0;
                for (int l=0;l<10;l++){
                    if(l==0){
                        for (int z=0;z<bucket0.size();z++){
                            lista[contadorInts]=bucket0.get(z);
                            contadorInts++;
                        }
                    }
                    if(l==1){
                        for (int z=0;z<bucket1.size();z++){
                            lista[contadorInts]=bucket1.get(z);
                            contadorInts++;
                        }
                    }
                    if(l==2){
                        for (int z=0;z<bucket2.size();z++){
                            lista[contadorInts]=bucket2.get(z);
                            contadorInts++;
                        }
                    }
                    if(l==3){
                        for (int z=0;z<bucket3.size();z++){
                            lista[contadorInts]=bucket3.get(z);
                            contadorInts++;
                        }
                    }
                    if(l==4){
                        for (int z=0;z<bucket4.size();z++){
                            lista[contadorInts]=bucket4.get(z);
                            contadorInts++;
                        }
                    }
                    if(l==5){
                        for (int z=0;z<bucket5.size();z++){
                            lista[contadorInts]=bucket5.get(z);
                            contadorInts++;
                        }
                    }
                    if(l==6){
                        for (int z=0;z<bucket6.size();z++){
                            lista[contadorInts]=bucket6.get(z);
                            contadorInts++;
                        }
                    }
                    if(l==7){
                        for (int z=0;z<bucket7.size();z++){
                            lista[contadorInts]=bucket7.get(z);
                            contadorInts++;
                        }
                    }
                    if(l==8){
                        for (int z=0;z<bucket8.size();z++){
                            lista[contadorInts]=bucket8.get(z);
                            contadorInts++;
                        }
                    }
                    if(l==9){
                        for (int z=0;z<bucket9.size();z++){
                            lista[contadorInts]=bucket9.get(z);
                            contadorInts++;
                        }
                    }
                }
                bucket0.clear();
                bucket1.clear();
                bucket2.clear();
                bucket3.clear();
                bucket4.clear();
                bucket5.clear();
                bucket6.clear();
                bucket7.clear();
                bucket8.clear();
                bucket9.clear();
            }
            return lista;
        }
    }        
}
