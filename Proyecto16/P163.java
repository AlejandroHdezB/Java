import java.util.Scanner;
public class P163 {
    private Scanner teclado;
    private float[] grupoA;
    private float[] grupoB;
    private float sumaA=0;
    private float sumaB=0;
    private float proA=0;
    private float proB=0;

    public void PrimerGrupo(){
        teclado=new Scanner(System.in);
        grupoA=new float[6];
        for(int f=0; f<5; f++){
            int suma= f+1;
            System.out.println("Ingresar la calificacion del alumno " + suma + ", del grupo A");
            grupoA[f]=teclado.nextFloat();
        }
    }
    public void SegundoGrupo(){
        teclado=new Scanner(System.in);
        grupoB=new float[6];
        for(int f=0; f<5; f++){
            int suma= f+1;
            System.out.println("Ingresar la calificacion del alumno " + suma + ", del grupo B");
            grupoB[f]=teclado.nextFloat();
        }
    }
    public void Promedio(){
        teclado=new Scanner(System.in);
        for(int f=0; f<5; f++){
            sumaA=grupoA[f] + sumaA;
        }
        float proA= sumaA/5;
        System.out.println("El promedio del grupo A es: " + proA);
        for(int f=0; f<5; f++){
            sumaB= grupoB[f] + sumaB;
        }
        float proB= sumaB/5;
        System.out.println("El promedio del grupo B es: " + proB);
    }
    public static void main (String[] ar){
        P163 maquinola=new P163();
        maquinola.PrimerGrupo();
        maquinola.SegundoGrupo();
        maquinola.Promedio();
    }
}
