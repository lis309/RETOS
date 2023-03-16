 
import java.util.Random;
import java.util.Scanner;
//crear clase
public class reto6 {
    //invocar metodo main
    public static void main(String args[]){
        //Instanciar clase ramdom
		Random Aleatorio = new Random();

        //declarar variables
        int moneda=0;
        String nombre;
        int numerador=0;
        int n=0;
        int numRep=0;
        int apuesta=0;
        int suma=0;
        int resta=0;
        int resultado=0; 
        int oportunidades=0;

        //Instanciar clase scanner
        Scanner Capturar= new Scanner(System.in);

        //condicion
        do {
            n++;
            //solicitar datos
            System.out.println("Digite la cantidad que desea apostar");
            apuesta=Capturar.nextInt();
            //solicitar datos
            System.out.println("Digite cara o sello: cara=0 y sello=1");
            moneda=Capturar.nextInt();
            System.out.println("Digite su nombre");
            nombre=Capturar.next();

            //operacion de numero aleatorio
            numerador=Aleatorio.nextInt(1);
            
            if (numerador==0 && moneda==0 || numerador==1 && moneda==1) {
                suma=suma+apuesta*2;
                resultado=suma;
            }
            else {
                resta=suma-apuesta;
                resultado=resta;
            }
            
            System.out.println("Su nombre es "+nombre+" y aposto "+apuesta);

            //condicion
            if (numerador==0 && moneda==0 || numerador==1 && moneda==1) {
                System.out.println("El ganador fue: " + nombre);
            }
            else {
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