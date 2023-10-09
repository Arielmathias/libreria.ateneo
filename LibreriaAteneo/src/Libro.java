
/**
 *
 * @author arielmathias
 */
public class Libro {
    
    private String titulo, autor, isbn;
    private int precio;

    public Libro() {
    }

    public Libro(String titulo, String autor, String isbn, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", precio=" + precio + '}';
    }
    
    public void imprimirInfo (){
        
        System.out.println("Titulo: "+ this.titulo);
        System.out.println("Autor: "+ this.autor);
        System.out.println("Precio: "+ this.precio);
        System.out.println("ISBN: "+this.isbn);
        
    }
    
    public double calcularIva(){
        double IVA = 0.19;
        
        return this.precio * IVA;
        
    }
    
}
