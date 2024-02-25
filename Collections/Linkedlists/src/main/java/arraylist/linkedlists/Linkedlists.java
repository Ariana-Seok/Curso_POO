package arraylist.linkedlists;

import java.util.LinkedList;
import java.util.List;


public class Linkedlists {

    public static void main(String[] args) {
        List<Persona> lista = new LinkedList<Persona>();
        
        // Agregar personas al final de la lista
        lista.add(new Persona(1, "Daniela", 23));
        lista.add(new Persona(2, "Pedro", 23));
        lista.add(new Persona(3, "Pepe", 23));
        lista.add(new Persona(4, "Paz", 23));
        lista.add(new Persona(5, "Uma", 23));
        lista.add(new Persona(6, "Julia", 23));
        
        // Agregar al inicio (debemos agregar un parametro, el cual seria la posicion)
        lista.add(0, new Persona(0, "Alexander", 26));
        lista.add(2, new Persona(10, "Carlos", 24));
        
        /* No se puede recorrer asi.
        System.out.println("------------------- For ------------------");
        
        // Recorrer por indice
        for (int i = 0; i < lista.size(); i++){
            System.out.println("Prueba" + lista.get(i).getNombre());
        }
        */
        // Recorrido ForEach: Elemento por elemento
        
        System.out.println("----------------- ForEach ------------------------");
        
        
        for (Persona perso: lista) {
            System.out.println("Prueba: " + perso.getNombre());
        }
    }
}
