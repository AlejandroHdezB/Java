import java.util.Scanner;

 class EstructuraConCom {
	 public static void main(String[] mayor) {
		 Scanner teclado= new Scanner(System.in);
		 float p;
		 float s;
		 System.out.print("Ingrese el primer numero");
		 p = teclado.nextFloat();
		 System.out.print("Ingrese el segundo numero");
		 s = teclado.nextFloat();
		 if (p==s) {
			 System.out.println("Los numeros son iguales");
		 }
		 	if (p > s) {
			 System.out.println("El mas grande es:" );
			 System.out.println(p);
			 System.out.println("El mas pequeno es:");
			 System.out.println(s);
		 } 	else { 
			 System.out.println(s);
			 System.out.println(p);
			 
		 }
	 }
}
