import java.util.Scanner;

public class P105 {
	public static void main(String[] ar) {
		Scanner teclado= new Scanner(System.in);
		int e, n,ma,me;
		float s,suma;
		n = 1;
		ma=0;
		me=0;
		suma=0;
		System.out.println("Introducir Numero de empleados");
		e = teclado.nextInt();
		while (n <= e) {
			System.out.println("Ingresar sueldo ");
			s = teclado.nextFloat();	
			if(s>= 100 && s<=500) {
				suma= suma + s;
				if(s>=100 && s<300) {
					me++;
				}else {
					if(s>=300) {
						ma++;
					}
				}
		
			}else {
				System.out.println("Perdona eres un mentiroso ");		
		}
			n++;
			}
			System.out.println("La cantidad de empleados que tienen un sueldo mayor a 300 son ");
			System.out.println(ma);
			System.out.println("Mientras tanto los que tienen un sueldo que oscila entre 100 y 300 son ");
			System.out.println(me);
			System.out.println("El total de sueldo que la empresa gasta en sus empleados es ");
			System.out.println(suma);
		
	}
}