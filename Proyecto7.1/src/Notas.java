import java.util.Scanner;

public class Notas {
	public static void main(String[] cal) {
		 Scanner teclado= new Scanner(System.in);
		 float p;
		 float s;
		 float t;
		 float f;
		 System.out.print("Ingrese la primera calficacion");
		 p = teclado.nextFloat();
		 System.out.print("Ingrese la segunda calficacion");
		 s = teclado.nextFloat();
		 System.out.print("Ingrese la tercera calficacion");
		 t = teclado.nextFloat();
		 f = p+s+t/3;
		 if (f >= 7) {
			 System.out.print("Promocionado");
		 } else { 
			 System.out.print("Echale mas ganas");
		 }

		 
	}	  
}
