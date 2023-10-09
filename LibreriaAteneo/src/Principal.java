
import java.util.Scanner;


/**
 *
 * @author arielmathias
 */
public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Catalogo cat = new Catalogo();
        
//        Autor jk = new Autor("Julia", "Krut", "Chilena");
//        Libro harry = new Libro("Harry Potter", jk, "1234", 50000);
//        Libro harry2 = new Libro("La camara secreta", jk, "3242", 60000);
//        
//        Autor gabriela = new Autor("Gabriel", "Garcia", "Colombiana");
//        Libro soledad = new Libro("Mil años", gabriela, "1987", 40000);
//        
//        Autor tolken = new Autor("Elios", "Ortega", "Brasileño");
//        Libro elseñor = new Libro("La comunidad del anillo", tolken, "4321", 50000);
//        
//        cat.agregaLibro(elseñor);
//        cat.agregaLibro(harry);
//        cat.agregaLibro(soledad);
//        cat.agregaLibro(harry2);
//        cat.mostrarCatalogo();
//        System.out.println("------------------------------------------");
//        cat.eliminarLibroIsbn("1234");
//        System.out.println("------------------------------------------");
//        cat.mostrarCatalogo();
//        System.out.println("------------------------------------------");
//        cat.buscarLibroTitulo("La comunidad del anillo");
        while(true){
            System.out.println(" Bienvenido Biblioteca ");
            System.out.println("Escoja una opción");
            System.out.println("1.- Agregar libro");
            System.out.println("2.- Mostrar catalogo");
            System.out.println("3.- Buscar libro por titulo");
            System.out.println("4.- Eliminar libro"); 
            System.out.println("5.- Salir");
            
            int opcion = leer.nextInt();
            leer.nextLine();
             
            switch(opcion){
                
                case 1:
                    
                    System.out.println("Ingrese nombre autor: ");
                    String nombre = leer.nextLine();
                    
                    System.out.println("Ingrese apellido autor: ");
                    String apellido = leer.nextLine();
                    
                    System.out.println("Ingrese nacionalidad: ");
                    String nacionalidad = leer.nextLine();
                    
                    System.out.println("Ingrese Titulo del libro: ");
                    String titulo = leer.nextLine();
                    
                    System.out.println("Ingrese Precio: ");
                    int precio = leer.nextInt();
                    leer.nextLine();
                    System.out.println("Ingrese ISBN: ");
                    String isbn = leer.nextLine();
                    
                    
                    Autor autor = new Autor(nombre, apellido, nacionalidad);
                    Libro libro = new Libro(titulo, autor, isbn, precio);
                    
                    cat.agregaLibro(libro);
                    break;
                
                case 2: 
                    cat.mostrarCatalogo();
                    break;
                
                case 3:
                    
                    System.out.println("Ingresar Nombre del titulo");
                    String tituloLibro = leer.nextLine();
                    cat.buscarLibroTitulo(tituloLibro);
                    break;
                    
                case 4:
                    System.out.println("Ingrese ISBN: ");
                    String isbnEliminar = leer.nextLine();
                    cat.eliminarLibroIsbn(isbnEliminar);
                    break;
                    
                case 5: 
                    System.out.println("Hasta luego");
                    return;
                    
            }
                
            
            
            }

        
        


        
    }
}
        

