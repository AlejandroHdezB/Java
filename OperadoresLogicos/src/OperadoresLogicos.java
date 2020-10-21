import java.util.Scanner;

public class OperadoresLogicos {
	public static void main(String[] ar) {
		 Scanner teclado= new Scanner(System.in);
		 int p;
		 System.out.print("Ingrese su fecha");
		 System.out.print(" Primeramente el día");
		 p = teclado.nextInt();
		 int s;
		 System.out.print("Ahora el mes");
		 s = teclado.nextInt();
		 int t;
		 if(p==25 && s==12) {
			 System.out.print("Felicidades, va ser navidad");
		 }else {
				 System.out.print("No es naavidad");
			
		 }
	}
}	
