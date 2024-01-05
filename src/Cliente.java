import java.io.Serializable;
import java.util.Scanner;

public class Cliente implements ICliente {
    public String nombre = "";
    public String cedula = "";
    public int edad;


    @Override
    public void imprimirCliente() {
        System.out.println("El nombre del cliente es: "+nombre);
        System.out.println("La cedula del cliente es: "+cedula);
        System.out.println("La edad del clilente es: "+edad);
    }

    @Override
    public void ingresarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente");
        this.nombre = sc.next();
        System.out.println("Ingrese la cedula del producto");
        this.cedula = sc.next();
        System.out.println("Ingrese la edad de productos");
        this.edad = sc.nextInt();
    }
}
