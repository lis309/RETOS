import java.util.Random;
import java.util.Scanner;

//crear clase
public class reto7 {
    //invocar metodo main
    public static void main(String args[]){
        //Instanciar clase ramdom
		Random Aleatorio = new Random();

        //declarar variables
        int juego=0;
        int numerador=0;
        String nombre;
        int n=0;
        int numRep=0;
        int apuesta=0;
        int suma=0;
        int resta=0;
        int resultado=0; 
        int oportunidades=0;

        //instaciar la clase scanner
        Scanner Capturar= new Scanner(System.in);

        //condicion
        do {
            n++;
            //solicitar datos
            System.out.println("Digite la cantidad que desea apostar");
            apuesta=Capturar.nextInt();
            //solicitar datos
            System.out.println("Digite su nombre");
            nombre=Capturar.next();
            System.out.println("Digite piedra, papel o tijera: piedra=0, papel=1 y tijera=2");
            juego=Capturar.nextInt();

            //operacion de numero aleatorio
            numerador=Aleatorio.nextInt(2)+1;

            //creando condicion para el proceso de suma y resta de la apuesta          
            if (numerador==1 && juego==2 || numerador==2 && juego==0 || numerador==0 && juego==1) {
                suma=suma+apuesta*2;
                resultado=suma;
            }
            else if (numerador==0 && juego==2 || numerador==1 && juego==0 || numerador==2 && juego==1) {
                resta=suma-apuesta;
                resultado=resta;
            }
            else{
                resultado=resultado+0;
            }

            //condicion
            if (numerador==0 && juego==0 || numerador==1 && juego==1 || numerador==2 && juego==2) {
                System.out.println("Hubo empate");
            }
            else if (numerador==1 && juego==2 || numerador==2 && juego==0 || numerador==0 && juego==1) {
                System.out.println("El ganador fue: " + nombre);
            }
            else if (numerador==0 && juego==2 || numerador==1 && juego==0 || numerador==2 && juego==1) {
                System.out.println("El ganador fue: La maquina");
                oportunidades=oportunidades+1;
                if (oportunidades==3) {
                    System.out.println("Usted jugo "+n+" veces y gano "+resultado);
                    System.out.println("Desea seguir jugando: 1.si, 2.no");
                    numRep=Capturar.nextInt();
                } 
            }
            
        } while (oportunidades<3 || numRep==1);

        
        
        Capturar.close();


     }
}
