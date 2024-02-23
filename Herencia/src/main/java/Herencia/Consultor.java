package Herencia;


public class Consultor extends Persona{
    String nombre_consultora;
    int num_consultor;
    
    // Constructores
    public Consultor(){}
    
    public Consultor(String nombre_consultora, int num_consultor, int id,String dni,
            String nombre, String apellido, String domicilio,
            String telefono){
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_consultora = nombre_consultora;
        this.num_consultor = num_consultor;
    }
}
