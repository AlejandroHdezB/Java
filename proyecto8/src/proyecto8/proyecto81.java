package proyecto8;

import java.util.Scanner;
public class proyecto81 {
	public static void main(String[] mayor) {
	 Scanner teclado= new Scanner(System.in);
	 float p;
	 float s;
	 float t;
	 System.out.print("Ingrese primer numero");
	 p = teclado.nextFloat();
	 System.out.print("Ingrese segundo numero");
	 s = teclado.nextFloat();
	 System.out.print("Ingrese tercer numero");
	 t = teclado.nextFloat();
	 if (p > s) { 
		 if(p > t) {
			 System.out.print(p);
		 } else {
			 System.out.print(t);
		 }
	 }if (s > p) {
		 if(s > t) {
			 System.out.print(s);
		 } else {
			 System.out.print(t);
		 }
	 }
	}
}
