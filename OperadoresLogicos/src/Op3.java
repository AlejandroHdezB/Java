import java.util.Scanner;

public class Op3 {
	public static void main(String[] ar) {
		Scanner teclado= new Scanner(System.in);
		float p;
		 System.out.print("Ingresar su primer numero por favor");
		 p = teclado.nextFloat();
		 float s;
		 System.out.print("Ingresar su segundo numero por favor");
		 s = teclado.nextFloat();
		 float t;
		 System.out.print("Ingresar su tercer numero por favor");
		 t = teclado.nextFloat();
		 if(p < 10 && s < 10 && t < 10) {
			 System.out.print("Sus numeros ingresados son todos menores a 10");
		 }else {
			 System.out.print("Sus numeros son mayores a 10");
		 }
	}
}
