import java.util.Scanner;

public class Digitos {
	public static void main(String[] digitos) {
		 Scanner teclado= new Scanner(System.in);
		 float p;
		 System.out.print("Ingrese el numero");
		 p = teclado.nextFloat();
		 if (p >= 10) {
			 System.out.print("El numero tiene dos digitos");
		 }
		 else { System.out.print("el numero tiene un digito");

		 }
	}
}
