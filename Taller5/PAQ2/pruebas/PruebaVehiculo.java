package Taller5.PAQ2.pruebas;

import vehiculos.Moto;

public class PruebaVehiculo {
    public static void main(String[] args) {
        
        Moto miMoto = new Moto("Deportiva", "Yamaha R1");
        // Intentar acceder a los atributos de Vehiculo y Moto
        // Esto generará un error de compilación porque 'tipo' no es accesible
        // System.out.println("Tipo: " + miMoto.tipo); // Descomentar para ver el error
    }
}
