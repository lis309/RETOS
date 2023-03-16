import java.util.Scanner;

//Creación de la clase
public class reto2 {
    //Invocación del metodo
    public static void main(String[] args) {
        
        //Declaración de variables
        String nomEnfermera;
        String nomMama;
        String nomBebe;
        int pesoBebe=0;
        int mesesBebe=0;
        int dosisVacuna=0;

        //Instanciar la clase scanner
        Scanner Capturar= new Scanner(System.in);

        //Solicitar datos
        System.out.println("Ingrse el nombre de la enfermera: ");
        //Capturar datos
        nomEnfermera=Capturar.next();
        System.out.println("Ingrse el nombre de la mamá: ");
        nomMama=Capturar.next();
        System.out.println("Ingrse el nombre del bebe: ");
        nomBebe=Capturar.next();
        System.out.println("Ingrse el numero de meses del bebe : ");
        mesesBebe= Capturar.nextInt();
        System.out.println("Ingrse el peso del bebe en kilos: ");
        pesoBebe= Capturar.nextInt();

        //operación
        dosisVacuna=(pesoBebe + 10 / mesesBebe * 10) * 8;

        System.out.println("El nombre de la enfermera es: " + nomEnfermera + " El nombre de la mamá es: " + nomMama + " El nombre del bebe es: " + nomBebe + " La dosis de la vacuna del bebe es: " + dosisVacuna);

        //Limpiar el buffer
        Capturar.close();

    }
}
