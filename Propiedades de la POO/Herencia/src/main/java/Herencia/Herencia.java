package Herencia;

public class Herencia {

    public static void main(String[] args) {
        //Empleado empleado = new Empleado();
        
        //empleado.getNumLegajo();
        
        //empleado.getNombre();
        
        Persona vector[] = new Persona[5];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
        
        Persona persona = new Persona();
        Consultor consultor = new Consultor();
        
        persona = consultor;
        
        
    }
}
