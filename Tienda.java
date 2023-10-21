import java.util.List;
import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        // Cargar el inventario de productos desde un archivo CSV.
        List<Producto> inventario = CSVReader.productosCSV("productos.csv");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Menú de opciones
            System.out.println("Ingresa una opción");
            System.out.println("1. Buscar producto por ID");
            System.out.println("2. Listar productos por categoría");
            System.out.println("3. Mostrar ventas y comisiones");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el ID del producto: ");
                    int idBuscado = scanner.nextInt();
                    // Llama a la función para buscar un producto por ID
                    Funciones.buscarID(inventario, idBuscado);
                    break;
                case 2:
                    System.out.print("Ingrese la categoría a buscar: ");
                    scanner.nextLine(); // Consumir el salto de línea anterior
                    String categoriaBuscada = scanner.nextLine();
                    // Llama a la función para listar productos por categoría
                    Funciones.listarCategoria(inventario, categoriaBuscada);
                    break;
                case 3:
                    // Llama a la función para mostrar ventas y comisiones
                    Funciones.ventaYComision(inventario);
                    break;
                case 4:
                    System.out.println("Finalizando programa.");
                    return; // Sale del programa
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}