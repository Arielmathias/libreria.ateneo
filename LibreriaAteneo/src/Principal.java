/**
 *
 * @author arielmathias
 */
public class Principal {
    
    public static void main(String[] args) {
        Libro harry = new Libro("Harry Potter", "JK Rowling", "1234", 20000);
        
        
        harry.imprimirInfo();
        System.out.println("IVA: "+harry.calcularIva());
        
    }
        
}
