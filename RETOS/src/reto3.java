 
import java.util.Random;
import java.util.Scanner;
//crear clase
public class reto3 {
    //invocar metodo main
    public static void main(String args[]){
        //Instanciar clase ramdom
		Random Aleatorio = new Random();

        //declarar variables
        int moneda=0;
        String nombre;
        int numerador=0;
        int apuesta=0;
        int suma=0;
        int resta=0;
        int resultado=0;

        //Instanciar clase scanner
        Scanner Capturar= new Scanner(System.in);


        //solicitar datos
        System.out.println("Digite la cantidad que desea apostar");
        apuesta=Capturar.nextInt();
        //solicitar datos
        System.out.println("Digite cara o sello: cara=0 y sello=1");
        moneda=Capturar.nextInt();
        //solicitar datos
        System.out.println("Digite su nombre");
        nombre=Capturar.next();

        //operacion de numero aleatorio
        numerador=Aleatorio.nextInt(1);
        if (numerador==0 && moneda==0 || numerador==1 && moneda==1) {
            suma=suma+apuesta;
            resultado=suma;
        }
        else {
            resta=suma-apuesta;
            resultado=resta;
        }

        //condicion
        if (numerador==0 && moneda==0  || numerador==1 && moneda==1) {
            System.out.println("El ganador fue: " + nombre +" y acumulo "+resultado);
        }
        else if (numerador==1 && moneda==0 || numerador==0 && moneda==1) {
            System.out.println("El ganador fue: La maquina y usted acumulo "+resultado);
        }
        
        Capturar.close();

     }
}