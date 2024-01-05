import java.util.Scanner;

public class Producto  implements IProducto {

    public String nombre = "";
    public String codigo = "";
    public double precio;
    public int cantidad;

    @Override
    public void imprimirProducto() {
        System.out.println("El nombre del producto es: "+nombre);
        System.out.println("El codigo del producto es: "+codigo);
        System.out.println("La cantidad del producto es: "+cantidad);
        System.out.println("El precio del producto es: "+precio);
    }

    @Override
    public void ingresarProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto");
        this.nombre = sc.next();
        System.out.println("Ingrese el codigo del producto");
        this.codigo = sc.next();
        System.out.println("Ingrese la cantidad de productos");
        this.cantidad = sc.nextInt();
        System.out.println("Ingrese el precio del producto");
        this.precio = sc.nextDouble();
    }
}
