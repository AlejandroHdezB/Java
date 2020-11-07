/* Se desea saber la temperatura media trimestral de cuatro paises. 
Para ello se tiene como dato las temperaturas medias mensuales de dichos paises.
Se debe ingresar el nombre del país y seguidamente las tres temperaturas
 medias mensuales.
Seleccionar las estructuras de datos adecuadas para el almacenamiento de los 
datos en memoria.
a - Cargar por teclado los nombres de los paises y las temperaturas medias mensuales.
b - Imprimir los nombres de las paises y las temperaturas medias mensuales 
    de las mismas.
c - Calcular la temperatura media trimestral de cada país.
c - Imprimr los nombres de los paises y las temperaturas medias trimestrales.
b - Imprimir el nombre del pais con la temperatura media trimestral mayor.*/
import java.util.Scanner;
public class P241 {
    private Scanner teclado;
    private String[] Paises;
    private int[][] Temperaturas;
    private int[] Promedios;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        Paises=new String[4];
        Temperaturas=new int[4][3];
        for(int f=0;f<Paises.length;f++){
            System.out.println("Intruduzca su pais: " );
            System.out.println("Paises ingresados: " + f );
            Paises[f]=teclado.next();
            for(int c=0;c<Temperaturas[f].length;c++) {
                System.out.print("Intruduzca temperatura " + (c+1) + " del pais de " + Paises[f] + " ");
                Temperaturas[f][c]=teclado.nextInt();
            }
        }
    }

    public void Imprimir1() {
        for(int f=0;f<Paises.length;f++){
                System.out.println("Del pais " + Paises[f] + " sus temperaturas son: ");
            for(int c=0;c<Temperaturas[f].length;c++) {
                System.out.println(Temperaturas[f][c]);
            }
        }
    }
    public void calcular() {
        Promedios=new int[4];
        int promedio=0;
        for(int f=0;f<Temperaturas.length;f++) {
          for(int c=0;c<Temperaturas[f].length;c++) {
              promedio=promedio+Temperaturas[f][c];
              promedio=promedio/3;
          }
          Promedios[f]=promedio;
        }
    }
    
    public void Imprimir2() {
        for(int f=0;f<Paises.length;f++){
                System.out.println("Del pais " + Paises[f] + " su temperatura media trimestral es: ");
                System.out.println(Promedios[f]);
            }
        }
    
    public void Mayor() {
        int m=0;
        String p = null;
        for(int f=0;f<Promedios.length;f++) {
            if (Promedios[f]>m) {
                m=Promedios[f];
                p=Paises[f];
            }
        }
        System.out.println("El pais con mayor media de temperatura trimestral es: "+ p + " con una temperatura de: "+ m);
    }
    

    public static void main(String[] ar){
        P241 maquina=new P241();
        maquina.cargar();
        maquina.Imprimir1();
        maquina.calcular();
        maquina.Imprimir2();
        maquina.Mayor();
    }
}