package proyecto8;

import java.util.Scanner;
public class proyecto83 {
	public static void main(String[] mayor) {
		 Scanner teclado= new Scanner(System.in);
		 float p;
		 System.out.print("Ingrese un numero");
		 p = teclado.nextFloat();
		 if(p < 1000) {
			 System.out.print("tu numero tiene 3 digitos");
		 }else { if(p < 100) {
			 System.out.print("tu numero tiene 2 digitos");
		 	}else { if(p < 10) {
		 		System.out.print("tu numero tiene 1 digito");			
		 		}else {
		 			System.out.print("ese numero no es valido");
		 		}
		 		
		 	}
			 
		 }
		 
	}
}
