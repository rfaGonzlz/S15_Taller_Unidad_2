
// Clase abstract que define la estructura para las proximas clases.
public  abstract class AnimalesAbstract {

    // Atributos de la clase.
    private String nombre, tipo, genero;

    // Constructor por defecto.
    public AnimalesAbstract() {
    }
    // Constructor que recibe los atributos de la clase.
    public AnimalesAbstract(String nombre, String tipo, String genero) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.genero = genero;
    }

    // Métodos para obtener y establecer los atributos de la clase.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

// Métodos abstractos que deben ser implementados por las clases que hereden de esta.
    public abstract void agregarAnimal();
    public abstract void imprimirAnimales();
}
