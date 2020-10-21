import java.util.Scanner;

public class Proyecto711 {
	public static void main(String[] zzz) {
		 Scanner teclado= new Scanner(System.in);
		 float p;
		 float s;
		 System.out.print("Ingrese el primer numero");
		 p = teclado.nextFloat();
		 System.out.print("Ingrese el segundo numero");
		 s = teclado.nextFloat();
		 	if (p > s) {
			 System.out.println("Pues el primero es mas grande:" );
			 System.out.println(p + s);
			 System.out.println(p - s);	 
		 } 	if (p < s) {
			 System.out.println("Pues el segundo es mas grande:" );
			 System.out.println(p * s);
			 System.out.println(p / s);
		 } 
		 	if (p==s) {
			 System.out.println("Los numeros son iguales y no voy hacer nada");
		 	}
		 }
	 }

