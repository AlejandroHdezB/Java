import java.util.Scanner;

public class Condicionalsimple {
	public static void main(String[] simple) {
		Scanner teclado= new Scanner(System.in);
		float i;
		System.out.print("Ingrese el salario");
    	i = teclado.nextFloat();
    	if (i >= 3000) {
    		System.out.print("Metele a los impuestos");
    	}
	}	
}
