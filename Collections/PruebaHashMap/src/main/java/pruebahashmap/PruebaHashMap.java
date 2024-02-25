package pruebahashmap;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {

    public static void main(String[] args) {
        Map<Integer, String> mapaEmpleados = new HashMap<>();
        
        // Agregamos datos al mapa
        
        mapaEmpleados.put(1523, "Ema");
        mapaEmpleados.put(1524, "Lupe");
        mapaEmpleados.put(1525, "Daniela");
        mapaEmpleados.put(1526, "Camila");
        mapaEmpleados.put(1527, "Camilo");
        
        // Verificamos si existe tal valor
        boolean estaono = mapaEmpleados.containsValue("Camilo");

        // Verificamos si existe dicha clave
        boolean estaClave = mapaEmpleados.containsKey(1442);
        
        if(estaClave){
            System.out.println("El valor buscado esta");
        } else {
            System.out.println("El valor buscado no esta");
        }
        
        // Muestra una lista de valores que tiene el map
        System.out.println(mapaEmpleados.values());
        
        // Muestra una lista de claves que tiene el map
        System.out.println(mapaEmpleados.keySet());
        
        // Buscara el valor que haya en dicha clave caso contrario devuelve NULL
        String nombre = mapaEmpleados.get(1524);
        String nombre2 = mapaEmpleados.get(1530);
        
        System.out.println("Clave 1524: " + nombre);
        System.out.println("Clave 1530: " + nombre2);
        
        // Como eliminar datos del mapa
        
        mapaEmpleados.remove(1527);
        
        System.out.println(mapaEmpleados.keySet());
    }
}
