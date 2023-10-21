public class Bebidas extends Producto {
    // Atributos específicos de la clase Bebidas
    private int mililitros;
    private String tipo;

    // Constructor de la clase Bebidas que recibe varios parámetros
    public Bebidas(int id, String nombre, int cantidadDisponible, int cantidadVendidos, String estado, double precio, int mililitros, String tipo) {
        // Llama al constructor de la clase base 'Producto' usando 'super'
        super(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio, "Bebida");
        
        // Inicializa los atributos específicos de Bebidas
        this.mililitros = mililitros;
        this.tipo = tipo;
    }

    // Método para obtener la cantidad de mililitros de la bebida
    public int getMililitros() {
        return mililitros;
    }

    // Método para obtener el tipo de bebida
    public String getTipo() {
        return tipo;
    }
}