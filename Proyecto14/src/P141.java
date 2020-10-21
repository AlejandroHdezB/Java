/*
 * Confeccionar una clase que represente un empleado. Definir como atributos 
 * su nombre y su sueldo. Confeccionar los métodos para la carga, otro para imprimir
 *  sus datos y por último uno que imprima un mensaje si debe pagar impuestos 
 *  (si el sueldo supera a 3000)
 */
import java.util.Scanner;
public class P141 {
	private Scanner teclado;
	private float sueldo;
	private String nombre;
	
	public void pedir() {
		teclado=new Scanner(System.in);
		System.out.print("Ingresar su primer nombre: ");
        nombre=teclado.next();
        System.out.print("Ingresa tu sueldo " + nombre + ", Por favor ");
        sueldo=teclado.nextFloat();
	}
	public void imprimir() {
		System.out.println("De acuerdo, entonces:" );
		System.out.println("El(la) emplea@ " + nombre + " , Cuenta con un sueldo de: " + sueldo);
		System.out.println("Por lo tanto..." );
	}
	public void pagar() {
		if(sueldo >= 3000) {
			System.out.println("Tienes que pagar impuestos" );
		}else {
			if(sueldo < 3000) {
				System.out.println("No tienes que pagar impuestos" );
			}else {
				System.out.println("Disculpa hubo un error" );
			}
		}
	}
	
	public static void main(String[] labuena) {
		System.out.println("¡Hola!" );
		System.out.println("Bienvenido al SAT" );
		P141 impuestos;
		impuestos=new P141();
		impuestos.pedir();
		impuestos.imprimir();
		impuestos.pagar();
	}
}
