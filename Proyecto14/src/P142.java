import java.util.Scanner;

public class P142 {
	private Scanner teclado;
	private int numero1,numero2;
	private int sum=0;
	private int rest=0;
	private int multi=0;
	private int div=0;	
	
	public void entrada() {
		teclado=new Scanner(System.in);
		System.out.print("Ingresar su primer numero");
        numero1=teclado.nextInt();
        System.out.print("Ingresar su segundo numero");
        numero2=teclado.nextInt();
	}
	
	public void suma() {
		sum=numero1+numero2;
		System.out.print("La suma es " + sum);
	}
	public void resta() {
		rest=numero1-numero2;
		System.out.print(" La resta es " + rest);
	}
	public void multiplicacion() {
		multi=numero1*numero2;
		System.out.print(" La multiplicacion e " + multi);
	}
	public void division() {
		multi=numero1/numero2;
		System.out.print(" La division es " + div);
	}
	public static void main(String[] ar) {
		System.out.println("¡Hola!" );
		System.out.println("Dame 2 numeros y haremos cositas con ellos" );
		P142 opera;
		opera=new P142();
		opera.entrada();
		opera.suma();
		opera.resta();
		opera.multiplicacion();
		opera.division();
	}
  }