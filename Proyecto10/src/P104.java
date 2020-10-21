import java.util.Scanner;

public class P104 {
	public static void main(String[] ar) {
		Scanner teclado= new Scanner(System.in);
		int n, x;
		float e, s;
		System.out.println("Hola,¿cuantas personas vamos a medir hoy?");
		n = teclado.nextInt();
		x = 1;
		s = 0;
		while (x <= n) {
			System.out.println("Ingresar estatura ");
			e = teclado.nextFloat();
			s = e + s;
			x++;	
		}
		System.out.println("El promedio es ");
		System.out.println(s/n);
	}
}
