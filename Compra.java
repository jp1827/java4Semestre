import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/*
 * Esta clase simula el llenado de una carretilla con varios productos para comprar
 */

public class Compra 
{

    public static void main(String args[]) 
    {       
        menu();
    }

    public static void menu()
    {
        Scanner input = new Scanner(System.in);
        Carretilla car = new Carretilla();        

        try {
            System.out.println("Bienvenido que desea comprar:");
            System.out.println("1. Un producto de la lista");
            System.out.println("2. Un producto nuevo");
            System.out.println("3. Mostrar los productos de la carretilla");
            System.out.println("4. Salir");
            System.out.println("Escoga una de las opciones por su número.");
            int opcion = input.nextInt();
            switch (opcion) 
            {
                case 1:
                    listaProductos();
                    break;
                case 2:
                    // Solicitar datos del producto nuevo que sea comprar
		            System.out.println("Ingrese el nombre del producto que desea comprar");
		            String nombre = input.next();
		            System.out.print("Introduzca precio: ");
                    double precio = input.nextDouble();
		
		            // Agregar el producto a la carretilla
		            Producto producto1 = new Producto(nombre, precio);
                    car.agregar(producto1);
                    System.out.println("Datos guardados: ");
                    car.mostrar();
                    menu();
                    break;
                case 3:
                    car.mostrar();
                    menu();
                    break;
                case 4:
                    
                    break;
                default:
                    System.out.println("Se ha ingresado mal un dato, por favor vuelva a intentarlo");
                    System.console().readLine("presione enter para continuar...");
                    menu();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Se ha ingresado mal un dato, por favor vuelva a intentarlo");
            System.console().readLine("presione enter para continuar...");
            menu();
        }
    }

    public static void listaProductos()
    {
        List<String> lista = new ArrayList<String>();
        List<String> listaPrecio = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        Carretilla car = new Carretilla();  
        
        lista.add("Caja de leche");
        lista.add("Caja de leche");
        lista.add("Libra de café");
        lista.add("Pan de banano");
        lista.add("Galletas de chocolate");
        lista.add("Galletas de chocolate");
        lista.add("Galletas de vainilla");

        listaPrecio.add("12.00");
        listaPrecio.add("15.00");
        listaPrecio.add("50.00");
        listaPrecio.add("70.00");
        listaPrecio.add("10.00");
        listaPrecio.add("15.00");
        listaPrecio.add("7.00");

        System.out.println("Listado de productos a la venta:");
        System.out.println("1. Caja de leche         - Q.12.00");
        System.out.println("2. Caja de leche         - Q.15.00");
        System.out.println("3. Libra de café         - Q.50.00");
        System.out.println("4. Pan de banano         - Q.70.00");
        System.out.println("5. Galletas de chocolate - Q.10.00");
        System.out.println("6. Galletas de chocolate - Q.15.00");
        System.out.println("7. Galletas de Vainilla  - Q.7.00");

        try {
            // Solicitar datos del producto que sea desea comprar de la lista
		    System.out.println("Ingrese el número del producto que desea comprar de la lista");
		    int numeroProducto = input.nextInt();

            String nombre = lista.get(numeroProducto);
            String precio = listaPrecio.get(numeroProducto);
            Producto producto2 = new Producto(nombre, precio);
            car.agregar(producto2);
            System.out.println("Datos guardados: ");
            car.mostrar();
        } catch (Exception e) {
            System.out.println("Se ha ingresado mal un dato, por favor vuelva a intentarlo");
            System.console().readLine("presione enter para continuar...");
            listaProductos();
        }
        menu();
    }
}
