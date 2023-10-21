import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    // Método estático para leer y procesar un archivo CSV y retornar una lista de productos
    public static List<Producto> productosCSV(String archivo) {
        // Crear una lista para almacenar los productos
        List<Producto> productos = new ArrayList<>();
        String linea;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            // Leer la primera línea que contiene encabezados y descartarla
            br.readLine();

            // Leer las líneas de datos del archivo CSV
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en campos usando comas como separadores
                String[] datos = linea.split(",");

                // Extraer datos de los campos
                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                int cantidadDisponible = Integer.parseInt(datos[2]);
                int cantidadVendidos = Integer.parseInt(datos[3]);
                String estado = datos[4];
                double precio = Double.parseDouble(datos[5]);
                String categoria = datos[6];
                int mililitros = datos[7].equals("null") ? 0 : Integer.parseInt(datos[7]);
                String tipo = datos[8].equals("null") ? null : datos[8];
                int gramos = datos[9].equals("null") ? 0 : Integer.parseInt(datos[9]);
                String sabor = datos[10].equals("null") ? null : datos[10];
                String tamaño = datos[11].equals("null") ? null : datos[11];

                Producto producto;

                // Crear objetos de las clases específicas (Bebidas, Snacks, Cereales) según la categoría
                if (categoria.equals("Bebida")) {
                    producto = new Bebidas(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio, mililitros, tipo);
                } else if (categoria.equals("Snacks")) {
                    producto = new Snacks(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio, gramos, sabor, tamaño);
                } else if (categoria.equals("Cereal")) {
                    producto = new Cereales(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio, gramos, tamaño);
                } else {
                    // Si la categoría no coincide con ninguna de las anteriores, crear un objeto genérico de Producto
                    producto = new Producto(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio, categoria);
                }

                // Agregar el producto a la lista de productos
                productos.add(producto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Retornar la lista de productos
        return productos;
    }
}