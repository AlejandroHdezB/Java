import java.util.Scanner;
public class P201 {
    private Scanner teclado;
    private int[] numeros;
    private int n;
    private int aux;

    public void preguntainador() {
        teclado=new Scanner(System.in);
        System.out.print("Hola, ¿cuantos numeros vamos a ordenar?");
        n=teclado.nextInt();
        numeros=new int[n + 1];
        for(int f=1;f<numeros.length;f++) {
            System.out.println("Ingrese numero:");
            System.out.println("Numeros puestos: " +f);
            numeros[f]=teclado.nextInt();
        }
    }
	
    public void ordenainador() {
        for(int f=0;f<n;f++) {
            for(int q=0;q<n-f;q++) {
                if(numeros[q]>numeros[q+1]) {
                    aux=numeros[q];
                    numeros[q]=numeros[q+1];
                    numeros[q+1]=aux;
                }
            }
        }
    }
	
    public void imprimir() {
        System.out.println("Sus numeros están ordenados de menor a mayor.");
        for(int f=0;f<numeros.length;f++) {
            System.out.println(numeros[f]);
        }
    }
	
    public static void main(String[] args) {
        P201 correinador=new P201();
        correinador.preguntainador();
        correinador.ordenainador();
        correinador.imprimir();
    }
}