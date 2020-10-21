import java.util.Scanner;

public class P109 {
	public static void main(String[] ar) {
		Scanner teclado= new Scanner(System.in);
		int i,n,l,in,im;
		System.out.println("Hola, ¿cuantos numeros vamos a buscarles par o impar?");
		n = teclado.nextInt();
		i=1;
		in=0;
		im=0;
		l=0;
		while(i <= n) {
			System.out.println("Introducir numero");
			l = teclado.nextInt();
			if(l%2==0) {
				in++;
			}else {
				im++;
			}
			i++;
		}
		System.out.println("Total de numeros pares: ");
		System.out.println(in);
		System.out.println("Total de numeros impares");
		System.out.println(im);
	}
}
	
