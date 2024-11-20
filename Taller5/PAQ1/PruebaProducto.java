package Taller5.PAQ1;

// Clase de prueba para verificar el acceso a la clase Producto
public class PruebaProducto {
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop MacBook", 1200.00, 10);
        
        producto.mostrarInfo();
    }
}