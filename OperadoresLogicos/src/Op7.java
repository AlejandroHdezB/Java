import java.util.Scanner;


public class Op7 {
	public static void main(String[] ar) {
		 Scanner teclado= new Scanner(System.in);
		 float a;
		 System.out.print(" Ingresar primer numero ");
		 a = teclado.nextFloat();
		 float b;
		 System.out.print(" Ingresar segundo numero ");
		 b = teclado.nextFloat();
		 float c;
		 System.out.print(" Ingresar tercer numero ");
		 c = teclado.nextFloat();
		 if(a > b && a > c) {
			 if(b > c) {
				 System.out.print(a-c);
				 System.out.print(" el mas grande ");
				 System.out.print(a);
				 System.out.print(" el mas pequeño ");
				 System.out.print(c);
			 }else {
				 if(c > b) {
					 System.out.print(a-b);
					 System.out.print(" el mas grande ");
					 System.out.print(a);
					 System.out.print(" el mas pequeño ");
					 System.out.print(b);
				 }
			 }
		 }else {
			 if(b > c) {
				 System.out.print(b-a); 
				 System.out.print(" el mas grande ");
				 System.out.print(b);
				 System.out.print(" el mas pequeño ");
				 System.out.print(a);
			 }else {
				 if(c > b) {
					 System.out.print(c-a);
					 System.out.print(" el mas grande ");
					 System.out.print(c);
					 System.out.print(" el mas pequeño ");
					 System.out.print(a);
				 }
			 }
		 }

	}
}	
