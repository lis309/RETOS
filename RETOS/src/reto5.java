import java.util.Scanner;

//Crear clase
public class reto5 {
    //invocar metodo main
    public static void main(String[] args) {
        
        //declarar variables
        int numP =0;
        int precio=0;
        int suma=0;
        int n=0;
        String cliente;
        int docCliente=0;
        String empleado;

        //instaciar clase scanner
        Scanner Capturar= new Scanner(System.in);

        //solicitar datos
        System.out.println("Digite el nombre del cliente");
        //capturar datos
        cliente=Capturar.nextLine();
        //solicitar datos
        System.out.println("Digite el numero de documento del cliente");
        //capturar datos
        docCliente=Capturar.nextInt();
        //solicitar datos
        System.out.println("Digite el nombre del empleado");
        empleado=Capturar.nextLine();
        //solicitar datos
        System.out.println("Digite el numero de productos a comprar");
        //capturar datos
        numP=Capturar.nextInt();

        //ciclo
        while (n<numP) {
            n++;
            //solicitar datos
            System.out.println("Digite el valor del producto "+n);
            //capturar datos
            precio=Capturar.nextInt();
            System.out.println(n+". "+precio);
            suma=suma+precio;
        }    

        //salida resultado
        System.out.println("Lo atendio "+empleado+", su nombre es "+cliente+", su numero de documento es "+docCliente+", el total de su compra es "+suma);

        //limpiar buffer
        Capturar.close();
    }
}

