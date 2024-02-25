package arraylists;

import java.util.ArrayList;
import java.util.List;


public class ArrayLists {

    public static void main(String[] args) {
        // Primero inicializo el arrayList
        
        // Inicializo una lista que guardara cosas de tipo Persona
        // List<Persona> lista;
        
        // Inicializo el arrayList
        List<Persona> lista = new ArrayList<> ();
        
        lista.add(new Persona(1, "Daniela", 23));
        lista.add(new Persona(2, "Pedro", 23));
        lista.add(new Persona(3, "Pepe", 23));
        lista.add(new Persona(4, "Paz", 23));
        lista.add(new Persona(5, "Uma", 23));
        lista.add(new Persona(6, "Julia", 23));
        
        System.out.println("------------------- For ------------------");
        
        // Recorrer por indice
        for (int i = 0; i < lista.size(); i++){
            System.out.println("Prueba" + lista.get(i).getNombre());
        }
        
        // Recorrido ForEach: Elemento por elemento
        
        System.out.println("----------------- ForEach ------------------------");
        
        
        for (Persona perso: lista) {
            System.out.println("Prueba: " + perso.getNombre());
        }
    }
}
