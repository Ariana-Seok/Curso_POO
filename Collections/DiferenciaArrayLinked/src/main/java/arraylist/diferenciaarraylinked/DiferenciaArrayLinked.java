package arraylist.diferenciaarraylinked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DiferenciaArrayLinked {

    public static void main(String[] args) {
        
        // Creacion de una ArrayList
        List<Persona> listaArray = new ArrayList<Persona> ();
        
        // Carga de elementos
        
        listaArray.add(new Persona(1, "Luisina", 30));
        listaArray.add(new Persona(2, "Gabriel", 30));
        listaArray.add(new Persona(3, "Ibra", 9));
        listaArray.add(new Persona(4, "TodoCode", 2));
        
        
        // Creacion de una linkedList
        LinkedList<Persona> listaLinked = new LinkedList<Persona>();
        
        // Carga de elementos
        
        listaLinked.add(new Persona(1, "Luisina", 30));
        listaLinked.add(new Persona(2, "Gabriel", 30));
        listaLinked.add(new Persona(3, "Ibra", 9));
        listaLinked.add(new Persona(4, "TodoCode", 2));
        
        
        // Vamos a eliminar a la persona que se llama "Gabriel"
        
        
        // Eliminacion en ArrayList
        
        listaArray.remove(1);
        
        
        // Eliminacion en LinkedList
        
        String nombreBorrar = "Gabriel";
        
        for (Persona persona2: listaLinked){
            if(persona2.getNombre().equals(nombreBorrar)) {
                listaLinked.remove(persona2);
                break;
            }
        }
        
        
        System.out.println("------------Luego de eliminar -----------");
        
        System.out.println("------------------- ARRAYLIST ------------");
        
        for(Persona persona: listaArray){
            System.out.println("Prueba: " + persona.getNombre());
        }
        
        
        System.out.println("------------------ LINKEDLIST --------------");
        
        for(Persona persona: listaLinked){
            System.out.println("Prueba: " + persona.getNombre());
        }
        
        
        // Tamaño lista
        
        System.out.println("----------- Que tamaño tienen las listas ----------");
        System.out.println("Arraylist: " + listaArray.size());
        System.out.println("LinkedList: " + listaLinked.size());
        
        
        // Obtener primer objeto
        
        System.out.println("------- PRIMER Y ULTIMO OBJETO (solo para Linked list)");
        System.out.println("Primero de LinkedList: " + listaLinked.getFirst().toString());
        System.out.println("Ultimo de LinkedList: " + listaLinked.getLast().toString());
        
        
        
        // Borrar toda la lista
        
        System.out.println("-------Borrando lista .......... -----");
        listaArray.clear();
        listaLinked.clear();
        
        // Comprobar si esta vacia
        System.out.println("-------------Esta vacia alguna lista? ----");
        System.out.println("ArrayList: " + listaArray.isEmpty());
        System.out.println("LinkedList: " + listaLinked.isEmpty());
        
    }
}
