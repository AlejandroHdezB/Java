/* Crear una matriz de n * m filas (cargar n y m por teclado) 
Imprimir los cuatro valores que se encuentran en los vértices de la misma
 (mat[0][0] etc.) */
 import java.util.Scanner;
 public class P232 {
     private Scanner teclado;
     private int[][] mat;
     private int filas;
     private int columnas;
     
     public void cargar() {
         teclado=new Scanner(System.in);
         System.out.println("¡Hola!, vamos a hacer una matriz y sacar sus 4 vertices");
         System.out.println("Digame, ¿que numero de filas van a ser?");
         filas=teclado.nextInt();
         System.out.println("Ahora... ¿que numero de columnas van a ser?");
         columnas=teclado.nextInt();
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
 
     public void vertices(){
         System.out.println("Y... sus vertices son:...");
         int f=0;
                System.out.println(mat[f][f]);
                System.out.println(mat[f][columnas-1]);
                System.out.println(mat[filas-1][f]);
                System.out.println(mat[filas-1][columnas-1]);
     }
     public static void main(String[] ar) {
         P232 maquina=new P232();
         maquina.cargar();
         maquina.vertices();
     }   
 }
 