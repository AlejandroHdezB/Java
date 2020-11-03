import java.util.Scanner;
public class P191 {
    private Scanner teclado;
    private float[] numeros;


    public void Preguntar() {
        teclado=new Scanner(System.in);
        int n;
        System.out.print("Hola, ¿cuantos numeros desea calcular?");
        n=teclado.nextInt();
        numeros=new float[n];

        for(int f=0;f<numeros.length;f++) {
            System.out.println("Ingrese numero: ");
            numeros[f]=teclado.nextFloat();
        }
    }
    
    public void Imprimir() {
        float menor;
        menor=numeros[0];
        for(int f=1;f<numeros.length;f++) {
            if (numeros[f]<menor) {
                menor=numeros[f];
            }
        for(int a=1;a<numeros.length;a++){
            if (numeros[a]==menor){
                System.out.println("Hay un numero que se repite crack");
            }
         }
        }
        System.out.println("El numero menor es "+menor);
    }
    
    public static void main(String[] args) {
        P191 maquina=new P191();
        maquina.Preguntar();
        maquina.Imprimir();
    }
}