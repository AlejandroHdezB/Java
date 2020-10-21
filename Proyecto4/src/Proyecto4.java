import java.util.Scanner;

public class Proyecto4 {
	public static void main(String[] sumando) {
		Scanner teclado= new Scanner(System.in);
			int p;
			int s;
			System.out.print("Ingrese el primer numero");
        	p = teclado.nextInt();
        	System.out.print("Ingrese el segundo numero");
        	s = teclado.nextInt();
        	System.out.println("La suma es:");
        	System.out.println(p + s);
        	System.out.println("El producto es:");
        	System.out.println(p * s);

  
	}
}