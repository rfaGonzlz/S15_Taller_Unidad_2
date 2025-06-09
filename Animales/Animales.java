import javax.swing.*;
import java.util.*;

/**
 * Clase Animales que extiende de la clase abstracta AnimalesAbstract.
 * Permite agregar y listar animales por tipo.
 */
public class Animales extends AnimalesAbstract {

    // Se define un escáner para la entrada de datos.
    Scanner scanner = new Scanner(System.in);
    // Se define un mapa para almacenar los animales, clasificados por tipo.
    Map<String, List<Animales>> animales = new TreeMap<>();
    // Se define una lista para almacenar los animales.
    List<Animales> animalesLista = new ArrayList<>();

    // Método constructor por defecto.
    public Animales() {
    }

    // Constructor que recibe los atributos de la clase.
    public Animales(String nombre, String tipo, String genero) {
        super(nombre, tipo, genero);
    }

    // Métodos para agregar y obtener los atributos de la clase.
    @Override
    public void agregarAnimal() {
        System.out.println("Digite la cantidad de animales que desea agregar:");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cantidad; i++) {

            System.out.println("\nDigite el nombre del animal # " + (i + 1) + ":");
            setNombre(scanner.nextLine());
            System.out.println("Tipo de animal (Terrestre, aéreo, acuático) # " + (i + 1) + ":");
            setTipo(scanner.nextLine());
            System.out.println("Género del animal (masculino, femenino) # " + (i + 1) + ":");
            setGenero(scanner.nextLine());

            Animales animal = new Animales(getNombre(), getTipo(), getGenero());
            // Agregar al map clasificando por tipo
            animales.computeIfAbsent(getTipo(), k -> new ArrayList<>()).add(animal);

        }
    }

    // Método para imprimir los animales agregados, clasificados por tipo.
    @Override
    public void imprimirAnimales() {
        System.out.println("\n\n\n-------------------------------------");
        System.out.println("Lista de animales agregados por tipo");
        System.out.println("-------------------------------------");

        // Recorrer el mapa de animales.
        for (Map.Entry<String, List<Animales>> entry : animales.entrySet()) {
            String tipo = entry.getKey();
            List<Animales> lista = entry.getValue();

            // Imprimir tipo de animal y sus nombres.
            System.out.println("\n" + (tipo).toUpperCase() + "S:");
            for (Animales animal : lista) {
                System.out.println("    " + animal.getNombre().toUpperCase());
            }
        }
    }
}

