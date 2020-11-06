/*Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes por columna 
(es decir primero ingresar toda la primer columna, luego la segunda columna y así sucesivamente)
Imprimir luego la matriz.*/
import java.util.Scanner;
public class P221 {
    private Scanner teclado;
    private int[][] Matriz;
    
    public void Preguntainador() {
        teclado=new Scanner(System.in);
        Matriz=new int[2][5];
        for(int f=0;f<2;f++) {
            for(int c=0;c<5;c++) {
                System.out.println("Ingrese numero de la:");
                System.out.println("Fila" + f);
                System.out.println("Columna" + c);
                Matriz[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void Impriminador() {
        for(int f=0;f<3;f++) {
            for(int c=0;c<5;c++) {
                System.out.println(Matriz[f][c]+" ");
            }
        }
    }
    
    public static void main(String[] ar) {
        P221 maquina=new P221();
        maquina.Preguntainador();
        maquina.Impriminador();
    }   
}