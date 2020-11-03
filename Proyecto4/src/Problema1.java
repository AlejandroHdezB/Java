import java.util.Scanner;
public class Problema1 {
    private Scanner entrada;
    private int valores;
    private int[]arreglo;
    public void Entrada(){
        entrada=new Scanner(System.in);
        System.out.println("Introduzca el numero de valores a introducir");
        valores= entrada.nextInt();
        arreglo=new int[valores];
        for(int n=0; n<valores;n++){
            System.out.println("Introduzca el valor "+n);
            arreglo[n]= entrada.nextInt();
        }
    }
    public void Condicion(){
        int menor = arreglo[0];
        int igual= arreglo[0];
        for(int n=0;n<arreglo.length;n++){
            if(arreglo[n]<menor){
                menor= arreglo[n];
            }
        }
        for(int f=0; f<=arreglo.length;f++){
            if(arreglo[f]==igual){
                igual= arreglo[f];
                }
        }
        System.out.println("El elemento menor es "+menor);
        System.out.println("Los elementos iguales son "+menor);
    }
    public static void main(String[]ar){
        Problema1 impresora=new Problema1();
        impresora.Entrada();
        impresora.Condicion();
    }
}