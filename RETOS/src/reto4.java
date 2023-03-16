import java.util.Random;
import java.util.Scanner;

//crear clase
public class reto4 {
    //invocar metodo main
    public static void main(String args[]){
        //Instanciar clase ramdom
		Random Aleatorio = new Random();

        //declarar variables
        int juego=0;
        int numerador=0;
        String nombre;
        int apuesta=0;
        int suma=0;
        int resta=0;
        int resultado=0; 

        //instaciar la clase scanner
        Scanner Capturar= new Scanner(System.in);

        //solicitar datos
        System.out.println("Digite la cantidad que desea apostar");
        apuesta=Capturar.nextInt();
        //solicitar datos
        System.out.println("Digite su nombre");
        nombre=Capturar.next();
        System.out.println("Digite piedra, papel o tijera: piedra=0, papel=1 y tijera=2");
        juego=Capturar.nextInt();

        //operacion de numero aleatorio
        numerador=Aleatorio.nextInt(2);

        if (numerador==1 && juego==2 || numerador==2 && juego==0 || numerador==0 && juego==1) {
            suma=apuesta*2;
            resultado=suma;
        }
        else if (numerador==0 && juego==2 || numerador==1 && juego==0 || numerador==2 && juego==1) {
            resta=apuesta-apuesta ;
            resultado=resta;
        }
        else if (numerador==0 && juego==0 || numerador==1 && juego==1 || numerador==2 && juego==2) {
            resultado=apuesta;
        }

        //condicion
        if (numerador==0 && juego==0 || numerador==1 && juego==1 || numerador==2 && juego==2) {
            System.out.println("Hubo empate y su valor acumulado fue "+resultado);
        }
        else if (numerador==0 && juego==2 || numerador==1 && juego==0 || numerador==2 && juego==1) {
            System.out.println("El ganador fue: La maquina y usted acumulo "+resultado);
        }
        else if (numerador==1 && juego==2 || numerador==2 && juego==0 || numerador==0 && juego==1) {
            System.out.println("El ganador fue: " + nombre +" y acumulo "+resultado);
        }

        Capturar.close();

     }
}
