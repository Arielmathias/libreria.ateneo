
/**
 *
 * @author arielmathias
 */
public class Principal {

    public static void main(String[] args) {
        Catalogo cat = new Catalogo();
        
        Autor jk = new Autor("Julia", "Krut", "Chilena");
        Libro harry = new Libro("Harry Potter", jk, "1234", 50000);
        Libro harry2 = new Libro("La camara secreta", jk, "3242", 60000);

        Autor gabriela = new Autor("Gabriel", "Garcia", "Colombiana");
        Libro soledad = new Libro("Mil años", gabriela, "1987", 40000);
        
        Autor tolken = new Autor("Elios", "Ortega", "Brasileño");
        Libro elseñor = new Libro("La comunidad del anillo", tolken, "4321", 50000);

        cat.agregaLibro(elseñor);
        cat.agregaLibro(harry);
        cat.agregaLibro(soledad);
        cat.agregaLibro(harry2);

        cat.mostrarCatalogo();
        System.out.println("------------------------------------------");
        cat.eliminarLibroIsbn("1234");
        System.out.println("------------------------------------------");
        cat.mostrarCatalogo();
        System.out.println("------------------------------------------");
        cat.buscarLibroTitulo("La comunidad del anillo");
        
        
        


        
    }
}
        

