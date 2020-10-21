import java.util.Scanner;
public class Op5 {
	public static void main(String[] ar) {
		 Scanner teclado= new Scanner(System.in);
		 int x;
		 System.out.print("Ingresar su x");
		 x = teclado.nextInt();
		 int y;
		 System.out.print("Ingresar su y");
		 y = teclado.nextInt();
		 if(x < 0 && y > 0) {
			 System.out.print("Su punto se encuentra en el cuadrante 1 es decir en el -+");
		 }else {
			 if(x > 0 && y > 0) {
				 System.out.print("Su punto se encuentra en el cuadrante 2 es decir en el ++");
			 }if(x < 0 && y < 0) {
				 System.out.print("Su punto se encuentra en el cuadrante 3 es decir en el --");
			 }if(x > 0 && y < 0) {
				 System.out.print("Su punto se encuentra en el cuadrante 4 es decir en el +-");
			 }
		 }
			 
	}
}
