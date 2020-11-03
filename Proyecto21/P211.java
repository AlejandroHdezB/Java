/*Cargar en un vector los nombres de 5 paises y en otro vector paralelo la cantidad de habitantes del mismo.
 Ordenar alfabéticamente e imprimir los resultados. Por último ordenar con respecto a la cantidad de habitantes 
 (de mayor a menor) e imprimir nuevamente.*/
import java.util.Scanner;
public class P211 {
    private Scanner teclado;
    private String[] paises;
    private int[] habitantes;
    
    public void preguntar() {
        teclado=new Scanner(System.in);
        paises=new String[5];
        habitantes=new int[5];
        System.out.println("Ingresar el nombre de 5 paises con su numero de habitnate: ");
        for(int f=0;f<paises.length;f++) {
            int suma=f;
            System.out.println("Inserte su pais: ");
            paises[f]=teclado.next();
            System.out.println("Inserte ahora los habitantes: ");
            System.out.println( "Paises ingresados: " + suma);
            habitantes[f]=teclado.nextInt();
        }
    }        
    
    public void ordenarA() {
        for(int k=0;k<paises.length;k++) {
            for(int f=0;f<paises.length-1-k;f++) {
                if (paises[f].compareTo(paises[f+1])>0) {
                    String aux;
                    aux=paises[f];
                    paises[f]=paises[f+1];
                    paises[f+1]=aux;
                }
            }
        }
    }
    public void ordenarB() {
        for(int k=0;k<habitantes.length;k++) {
            for(int f=0;f<habitantes.length-1-k;f++) {
                if (habitantes[f]<habitantes[f+1]) {
                    int aux;
                    aux=habitantes[f];
                    habitantes[f]=habitantes[f+1];
                    habitantes[f+1]=aux;
                }
            }
        }
    }
        
    public void imprimir() {
   	System.out.println("Sus paises ordenados son: ");
        for(int f=0;f<habitantes.length;f++) {
            System.out.println(paises[f]);
        }
        System.out.println("Y sus habitantes ordenados de mayor a menor: ");
        for(int f=0;f<habitantes.length;f++) {
            System.out.println(habitantes[f]);
        }
    }        

    public static void main(String[] ar) {
        P211 correr=new P211();
        correr.preguntar();
        correr.ordenarA();
        correr.ordenarB();
        correr.imprimir();
    }  	
}
