/*Confeccionar una clase para administrar una matriz irregular de 5 filas 
y 1 columna la primer fila, 2 columnas la segunda fila y así sucesivamente hasta 
5 columnas la última fila (crearla sin la intervención del operador)
Realizar la carga por teclado e imprimir posteriormente. */
import java.util.Scanner;
public class P251 {
    private Scanner teclado;
    private int[][] matriz;
    
    public void pedir() {
        teclado=new Scanner(System.in);
        int t;
        t=5;
        matriz=new int[t][];
        for(int f=0;f<matriz.length;f++) {      
            matriz[f]=new int[f+1];      
            for(int c=0;c<matriz[f].length;c++) {
                System.out.println("Ingrese numeros por favor:");
                matriz[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void imprimir() {
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                System.out.print(matriz[f][c]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] ar) {
        P251 maquina=new P251();
        maquina.pedir();
        maquina.imprimir();
    }   
}