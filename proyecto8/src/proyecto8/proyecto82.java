package proyecto8;

import java.util.Scanner;
public class proyecto82 {
	public static void main(String[] validacion) {
		 Scanner teclado= new Scanner(System.in);
		 float p;
		 System.out.print("Ingrese un numero");
		 p = teclado.nextFloat();
		 if (p > 0) {
			 System.out.print("numero positivo");
		 } if (p < 0){
			 System.out.print("numero negativo");	 
		 }
		 if (p==0){
			 System.out.print("numero nulo");
		 }

	}
}