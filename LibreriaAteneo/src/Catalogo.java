
import java.util.ArrayList;

/**
 *
 * @author arielmathias
 */
public class Catalogo {

    private ArrayList<Libro> catalogo = new ArrayList<>();

    public ArrayList<Libro> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Libro> catalogo) {
        this.catalogo = catalogo;
    }

    public void agregaLibro(Libro libro) {
        this.catalogo.add(libro);
    }

    public void mostrarCatalogo() {
        for (Libro libro : catalogo) {
            libro.imprimirInfo();

        }
    }

    public void eliminarLibroIsbn(String isbn) {
        for (Libro libro : catalogo) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                catalogo.remove(libro);
                System.out.println("Libro eliminado con éxito ");
                break;
                
            }

        }
    }

    public void buscarLibroTitulo(String titulo) {
        for (Libro libro : catalogo) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.imprimirInfo();
            }

        }
    }
}
