public class Cereales extends Producto {
    // Atributos específicos de la clase Cereales
    private int gramos;
    private String tamaño;

    // Constructor de la clase Cereales que recibe varios parámetros
    public Cereales(int id, String nombre, int cantidadDisponible, int cantidadVendidos, String estado, double precio, int gramos, String tamaño) {
        // Llama al constructor de la clase base 'Producto' usando 'super'
        super(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio, "Cereal");
        
        // Inicializa los atributos específicos de Cereales
        this.gramos = gramos;
        this.tamaño = tamaño;
    }

    // Método para obtener la cantidad de gramos del cereal
    public int getGramos() {
        return gramos;
    }

    // Método para obtener el tamaño del cereal
    public String getTamaño() {
        return tamaño;
    }
}