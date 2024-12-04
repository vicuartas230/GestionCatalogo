import Modelos.Libro;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Cien años de soledad", "Gabo", 6598745);
        Libro libro2 = new Libro("La voragine", "Jose Eustasio Rivera");
        System.out.println(libro.equals(libro2));
    }
}
