package Taller5.PAQ3.personas;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan Acevedo", 18);
        
        System.out.println("Edad: " + persona.edad); 

        System.out.println("Nombre: " + persona.getNombre());

        persona.setNombre("Carlos");
        System.out.println("Nombre modificado: " + persona.getNombre());   

        // Si intentas acceder al atributo nombre directamente (esto generará un error)
        // System.out.println("Nombre directo: " + persona.nombre); // Descomentar para ver el error
    }
}
