import java.util.Scanner;

//Creación de la clase
public class reto1 {
//Invocación del metodo
    public static void main(String[] args) {
        
        //Declaración de variables
        int gradosFaren=0;
        double gradosKel=0;
        double gradosCenti=0;

        //Instanciar la clase scanner
        Scanner Capturar=new Scanner(System.in);
        
        //Solicitar datos
        System.out.println("Digite los grados Fahrenheit");
        //Capturar datos
        gradosFaren=Capturar.nextInt();

        //operación
        gradosCenti=( gradosFaren - 32) / 1.8;
        gradosKel=( gradosFaren - 32) * 5/9 + 273.15 ;

        //Limpiar el buffer
        System.out.println("Los grados centigrados son: " + gradosCenti + " Los grados Kelvin son: " + gradosKel);
        Capturar.close();
    }
}