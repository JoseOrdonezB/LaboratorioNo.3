public class Snacks extends Producto {
    // Atributos específicos de la clase Snacks
    private int gramos;
    private String sabor;
    private String tamaño;

    // Constructor de la clase Snacks que recibe varios parámetros
    public Snacks(int id, String nombre, int cantidadDisponible, int cantidadVendidos, String estado, double precio, int gramos, String sabor, String tamaño) {
        // Llama al constructor de la clase base 'Producto' usando 'super'
        super(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio, "Snacks");
        
        // Inicializa los atributos específicos de Snacks
        this.gramos = gramos;
        this.sabor = sabor;
        this.tamaño = tamaño;
    }

    // Método para obtener la cantidad de gramos en el snack
    public int getGramos() {
        return gramos;
    }

    // Método para obtener el sabor del snack
    public String getSabor() {
        return sabor;
    }

    // Método para obtener el tamaño del snack
    public String getTamaño() {
        return tamaño;
    }
}