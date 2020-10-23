package Proyecto16;

import java.util.Scanner;
public class Problema1{
    private Scanner entrada;
    private float[] elemento;

    public void questions(){
        entrada=new Scanner(System.in);
        elemento=new float[8];
        for(int n=0;n<8;n++){
            System.out.println("Ingrese el valor del elemento "+n);
            elemento[n]=entrada.nextFloat();
    }
}
    public void suma(){
        float suma=0;
        for(int n=0;n<8;n++){
            suma=suma+elemento[n];
        }
        System.out.println("El valor acumulado de los elementos es "+suma);
    }
    public void mayores(){
        float mayor, mayor2;
        mayor=0;
        mayor2=0;
        for(int n=0;n<8;n++){
            if(elemento[n]>36 && elemento[n]<50){
                mayor++;
            }else{
                if(elemento[n]>50){
                    mayor2++;
                }
            }
        }
        System.out.println("Los elementos mayores a 36 son "+mayor);
        System.out.println("Los elementos mayores a 50 son "+mayor2);

    }
    public static void main(String[]ar){
        Problema1 exp=new Problema1();
        exp.questions();
        exp.suma();
        exp.mayores();
    }



}