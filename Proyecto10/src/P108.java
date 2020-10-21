import java.util.Scanner;

public class P108 {
	public static void main(String[] ar) {
		Scanner teclado= new Scanner(System.in);
		int i, in, im;
		float n, suma1, suma2, p;
		suma1 = 0;
		im=1;
		suma2=0;
		in=1;
		i=1;
		while(i <= 30) {
			while(in <= 15) {
			System.out.println("Introducir numero");
			n = teclado.nextFloat();
			suma1=suma1 + n;
			in++;
			}
			while(im <= 15) {
				System.out.println("Introducir numero");
				p = teclado.nextFloat();
				suma2=suma2 + p;
				im++;
			}
			i++;
		}
		
		System.out.print(suma1);
		System.out.println(" este es el total de la primera lista");
		System.out.print(suma2);
		System.out.println(" y este el total de la segunda lista");
		if(suma1 > suma2) {
			System.out.println("el mas grande es la primera lista");
		}else {
			if(suma2 > suma1) {
				System.out.println("el mas grande es la segunda lista");
			}
		}
		if(suma1==suma2) {
			System.out.println("las dos listas son lo mismo ");
		}
	}
}