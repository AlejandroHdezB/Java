import java.util.Scanner;

public class Op2 {
	public static void main(String[] ar) {
		 Scanner teclado= new Scanner(System.in);
		 float p;
		 System.out.print("Ingresar primer numero por favor");
		 p = teclado.nextFloat();
		 float s;
		 System.out.print("Ingresar segundo numero por favor");
		 s = teclado.nextFloat();
		 float t;
		 System.out.print("Ingresar tercer numero por favor");
		 t = teclado.nextFloat();
		 if(p==s && s==t) {
			 System.out.print("Sus numeros si son iguales por lo tanto voy a sumar los primeros dos y multiplicarlo con el tercero ");
			 System.out.print((p + s) * t);
		 }else {
			 System.out.print("Lo siento, tus numeros son diferentes y no voy hacer nada, gracias"); 
		 }
	}
}
