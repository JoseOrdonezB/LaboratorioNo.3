import java.util.List;

public class Funciones {
    // Método para buscar un producto por su ID en la lista de inventario
    public static void buscarID(List<Producto> inventario, int id) {
        for (Producto producto : inventario) {
            if (producto.getId() == id) {
                // Llama al método 'mostrarDetalles' del producto encontrado para mostrar su información
                producto.mostrarDetalles();
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    // Método para listar productos de una categoría específica en el inventario
    public static void listarCategoria(List<Producto> inventario, String categoria) {
        for (Producto producto : inventario) {
            if (producto.getCategoria().equalsIgnoreCase(categoria)) {
                // Llama al método 'mostrarDetalles' del producto para mostrar su información
                producto.mostrarDetalles();
            }
        }
    }

    // Método para calcular las ventas totales y la comisión por cereales en el inventario
    public static void ventaYComision(List<Producto> inventario) {
        double totalVentas = 0;
        double comision = 0;

        for (Producto producto : inventario) {
            totalVentas += producto.getPrecio() * producto.getCantidadVendidos();

            if (producto.getCategoria().equalsIgnoreCase("Cereal")) {
                // Calcula la comisión específica para los productos de la categoría "Cereal"
                comision += producto.getPrecio() * producto.getCantidadVendidos() * 0.20;
            }
        }

        // Imprime el total de ventas y la comisión por cereales
        System.out.println("Ventas totales: Q" + totalVentas);
        System.out.println("Comisión por cereales: Q" + comision);
    }
}