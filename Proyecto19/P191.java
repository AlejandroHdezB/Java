import java.util.Scanner;
public class P191 {
    private Scanner teclado;
    private float[] numeros;
    private float n;

    public void Preguntar() {
        teclado=new Scanner(System.in);
        System.out.print("Hola, ¿cuantos numeros desea calcular?");
        n=teclado.nextFloat();
        numeros=new float[n];
        for(int f=0;f<numeros.length;f++) {
            System.out.print("Ingrese numero:");
            numeros[f]=teclado.nextFloat();
        }
    }
    
    public void Imprimir() {
        float menor;
        menor=numeros[0];
        for(int f=1;f<nombres.length;f++) {
            if (numeros[f]<menor) {
                menor=numeros[f];
            }
        for(int a=1;a<nombres.length;a++){
            if (numeros[a]=menor){
                System.out.println("Hay un numero que se repite crack");
            }
         }
        }
        System.out.println("El numero menor es"+menor);
    }
    
    public static void main(String[] args) {
        P191 maquina=new P191();
        maquina.Preguntar();
        maquina.Imprimir();
    }
}