package proyecto8;

import java.util.Scanner;
public class proyecto84 {
	public static void main(String[] porcentanje) {
		 Scanner teclado= new Scanner(System.in);
		 float p;
		 System.out.print("Ingrese cantidad de preguntas");
		 p = teclado.nextFloat();
		 float s;
		 System.out.print("ingrese cantidad de preguntas correctas");
		 s = teclado.nextFloat();
		 float f;
		 f = p*s/100;
		 if(f <= 100) {
		 } if(f > 89) {
			 System.out.println(f);
			 System.out.print("Nivel Maximo :D");
		 }else {
		 	} if(f > 74) {
		 		System.out.println(f);
		 		System.out.print("Nivel Medio :/");
		 	}else {
		 		} if(f > 49) {
		 			System.out.println(f);
		 			System.out.print("Nivel Regular :c");
		 		}else {
		 			}if(f < 50) {
		 				System.out.println(f);
		 				System.out.print("Fuera de nivel...");
		 			}
		 	if(f > 100) {
		 		System.out.print("NO ES POSIBLE");
		 	}
	}
}