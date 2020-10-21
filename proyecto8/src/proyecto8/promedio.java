package proyecto8;

import java.util.Scanner;

public class promedio {
	public static void main(String[] cal) {
		 Scanner teclado= new Scanner(System.in);
		 float p;
		 float s;
		 float t;		 
		 System.out.print("Ingrese la primera calficacion");
		 p = teclado.nextFloat();
		 System.out.print("Ingrese la segunda calficacion");
		 s = teclado.nextFloat();
		 System.out.print("Ingrese la tercera calficacion");
		 t = teclado.nextFloat();
		 float f;
		 f = p+s+t/3;
		 if (f >= 7) {
			 System.out.print("Promocionado");
		 } else { 
			if (f >= 4) {
				System.out.print("Regular");
			} else { 
				System.out.print("Reprobado");
			}
		 }

		 
	}	  
}


