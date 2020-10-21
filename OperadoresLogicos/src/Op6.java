import java.util.Scanner;

public class Op6 {
	public static void main(String[] ar) {
		 Scanner teclado= new Scanner(System.in);
		 float sueldo;
		 System.out.print("Ingresar su sueldo ");
		 sueldo = teclado.nextFloat();
		 int anos;
		 System.out.print("Ingresar sus años de antiguedad ");
		 anos = teclado.nextInt();
		 float a;
		 if(sueldo < 500 && anos >= 10) {
			 System.out.print("su sueldo ahora es de " );
			 System.out.print(sueldo * .2 + sueldo);
		 }else {
			 if(sueldo < 500 && anos < 10) {
				 System.out.print("su sueldo ahora es de " );
				 System.out.print(sueldo * .05 + sueldo);
			 }else {
				 if(sueldo >= 500) {
					 System.out.print("su sueldo es el adecuado");
				 }
			 }
		 }
	}
}
	
