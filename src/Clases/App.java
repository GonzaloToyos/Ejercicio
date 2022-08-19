package Clases;
import javax.xml.stream.util.StreamReaderDelegate;

public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();

        persona1.setEdad(23);
        persona1.setNombre("PABLO");
        persona1.setTelefono("12345678");

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Telefono: " + persona1.getTelefono());
    }
}

