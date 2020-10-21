import java.util.Scanner;

public class P117 {
	public static void main(String[] ar) {
	  Scanner teclado=new Scanner(System.in);
	  float f,n, positivo, negativo, par, multi;
	  positivo=0;
	  negativo=0;
	  par=0;
	  multi=0;
	  System.out.println("Hola, dime 10 numeros y te dire cuales son positivos, negativos o multiplos a de 15 y cuantos son pares");
	  for(f=1;f<=10;f++) {
		  System.out.println("Insertar numero");
		  n=teclado.nextFloat();
		  if(n > 0) {
			  positivo++;
		  }else {
			  if(n < 0) {
				  negativo++;
			  }
		  }
		  if(n%15==0) {
			  multi++;
		  }
		  if(n%2==0) {
			  par++;
		  }
	  }
	  System.out.println("La cantidad de valores ingresados negativos.");
	  System.out.println(negativo);
	  System.out.println("La cantidad de valores ingresados positivos.");
	  System.out.println(positivo);
	  System.out.println("La cantidad de múltiplos de 15.");
	  System.out.println(multi);
	  System.out.println("El valor acumulado de los números ingresados que son pares.");
	  System.out.println(par);
	}
}