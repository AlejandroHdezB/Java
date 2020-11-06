/*Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la primer fila con la segundo.
 Imprimir luego la matriz. */
import java.util.Scanner;
public class P231 {
    private Scanner teclado;
    private int[][] mat;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.println("¡Hola!, vamos a crear una matriz e intercambier las primeras dos filas que me des");
        System.out.println("Digame, ¿que numero de filas van a ser?");
        int filas=teclado.nextInt();
        System.out.println("Ahora... ¿que numero de columnas van a ser?");
        int columnas=teclado.nextInt();
        mat=new int[filas][columnas];
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.println("Introduzca numero");
                System.out.print("'Numero de filas= " + f + "'");
                System.out.print("'Numero de columnas=" + c + "'");
                mat[f][c]=teclado.nextInt();
            }
        }
    }

    public void intercambio(){
        System.out.println("Y... la matriz con el intercambio es esas dos es:...");
        int f=1;
        int m=mat.length;
            for(int c=0;c<m;c++) {
                System.out.println(mat[f][c]);
        }
        int e=0;
            for(int c=0;c<m;c++) {
                System.out.println(mat[e][c]);
        }
            for(int v=2;v<m;v++){
                for(int c=0;c<m;c++){
                System.out.println(mat[v][c]);
                }
        }
    }
    public static void main(String[] ar) {
        P231 maquina=new P231();
        maquina.cargar();
        maquina.intercambio();
    }   
}
