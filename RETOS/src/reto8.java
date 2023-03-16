import java.util.Random;
import java.util.Scanner;

//crear clase
public class reto8 {
    //invocar metodo main
    public static void main(String args[]){
        //Instanciar clase ramdom
		Random Aleatorio = new Random();

        //declarar variables
        int num=0;
        int numerador=0;
        int n=0;
        int numRep=0;
        int ganador=0;

        //instaciar la clase scanner
        Scanner Capturar= new Scanner(System.in);

        //condicion
        do {
            n++;
            //solicitar datos
            System.out.println("Digite un numero del 1 al 100");
            num=Capturar.nextInt();

            //operacion de numero aleatorio
            numerador=Aleatorio.nextInt(99)+1;

            //creando condicion mos trar al usuario si el numero es mayor o menor        
            if (numerador==num) {
                System.out.println("Haz acertado!!");
                ganador=11; 
                System.out.println("Usted jugo "+n+" veces y acerto en el intento "+n);
                
            }
            if (numerador<num) {
                System.out.println("El numero es menor al ingresado");
                ganador=ganador+1; 
                if (ganador==10) {
                    System.out.println("Lo siento no lograste adivinar el numero, era "+numerador);
                    System.out.println("Usted jugo "+n+" veces y  no acerto en ningun intento");
                }

            }
            else if (numerador>num) {
                System.out.println("El numero es mayor al ingresado");
                ganador=ganador+1; 
                if (ganador==10) {
                    System.out.println("Lo siento no lograste adivinar el numero, era "+numerador);
                    System.out.println("Usted jugo "+n+" veces y no acerto en ningun intento");
                }
            }
            
        } while (numRep==1 || ganador<=10);

        System.out.println("Desea seguir jugando: 1.si, 2.no");
        numRep=Capturar.nextInt();
          
        Capturar.close();

     }
}