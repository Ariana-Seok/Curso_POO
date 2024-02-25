package pilas;

import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {
        // Creo un stack (Pila)
        
        Stack<Integer> pila = new Stack<Integer>();
        
        System.out.println("Lista vacia: " + pila);
        System.out.println("Esta vacia? " + pila.isEmpty());
        
        // Agregamos numero a nuestra pila de Integer
        
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        
        // Recorremos la pila con un Foreach
        
        for (Integer pilita : pila){
            System.out.println(pilita);
        }
        
        
        // Mostrar 
        
        System.out.println("Pila: " + pila);
        System.out.println("Pila vacia? " + pila.isEmpty());
        
        // Elimino el ultimo registro que se cargo
        pila.pop(); 
        
        System.out.println("Esta el 8 ?: " + pila.search(8)); // Si el numero esta devuleve la posicion, caso contrario -1
        System.out.println("Ultimo agregado: " + pila.peek());
        
    }
}
