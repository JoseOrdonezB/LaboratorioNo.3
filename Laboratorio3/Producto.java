public class Producto {
    // Atributos comunes para todos los productos
    protected int id;
    protected String nombre;
    protected int cantidadDisponible;
    protected int cantidadVendidos;
    protected String estado;
    protected double precio;
    protected String categoria;

    // Constructor de la clase Producto
    public Producto(int id, String nombre, int cantidadDisponible, int cantidadVendidos, String estado, double precio, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
        this.cantidadVendidos = cantidadVendidos;
        this.estado = estado;
        this.precio = precio;
        this.categoria = categoria;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadVendidos() {
        return cantidadVendidos;
    }

    public String getNombre() {
        return nombre;
    }

    // Método para mostrar los detalles del producto
    public void mostrarDetalles() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad Disponible: " + cantidadDisponible);
        System.out.println("Cantidad Vendidos: " + cantidadVendidos);
        System.out.println("Estado: " + estado);
        System.out.println("Precio: Q" + precio);
    }
}