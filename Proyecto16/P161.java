import java.util.Scanner;
public class P161 {
    private Scanner teclado;
    private float[] numeros;

    public void preguntainador(){
        teclado=new Scanner(System.in);
        numeros=new float[8];
        for(int f=0; f<8; f++){
            System.out.println("Ingresar siguiente numero");
            System.out.println("numeros ingresados= " + f);
            numeros[f]=teclado.nextFloat();
        }
    }
    public void sumainador(){
        float suma=0;
        for(int f=0;f<8;f++){
            suma=suma+numeros[f];
        }
        System.out.println("El valor acumulado de los elementos es "+suma);
        float cal=0;
        float tre,cin;
        tre=0;
        cin=0;
        for(int f=0;f<8;f++){
            if(suma>36 && suma<50){
                tre=tre + numeros[f];
            }else{
                if(suma>50){
                    cin=cin + numeros[f];
                }
        }
        }
         System.out.println("El acumulado de numeros mayores a 36 son: " + tre);
        System.out.println("El acumulado de numeros mayores a 50 son: " + cin);
    }
        
    public static void main (String[] ar){
        P161 maquinola=new P161();
        maquinola.preguntainador();
        maquinola.sumainador();
    }
}
