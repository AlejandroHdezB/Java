import java.util.Scanner;
public class P171 {
    private Scanner teclado;
    private float[] arreglo;

    public void preguntar(){
        teclado=new Scanner(System.in);
        System.out.println("¡Hola!, dime, ¿Cuantos numeros vamos a sumar?");
        float i;
        i=teclado.nextFloat();
        arreglo=new float [i];
        System.out.println("De acuerdo...");
        for (int f=0; f<arreglo.length; f++){
            int suma = f + 1;
            System.out.println("Ingresar numeros: numeros ingresados:" + suma);
        }
    }
    public void imprimir(){
        for (int f=0; f<arreglo.length; f++){
            int sumado=0;
            sumado=arreglo[i] + sumado;
        }
        System.out.println("La suma es: " + sumado);
    }

    public static void main(String[] args){
        P171 maquina=new P171();
        maquina.preguntar();
        maquina. imprimir();
    }
}
