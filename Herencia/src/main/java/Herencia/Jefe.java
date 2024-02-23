package Herencia;


public class Jefe extends Persona {
    int id_jefe;
    String departamento_jefe;
    
    // Constructores
    public Jefe(){}
    
    public Jefe(int id_jefe, String departamento_jefe,  int id,String dni,
            String nombre, String apellido, String domicilio,
            String telefono){
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.id_jefe = id_jefe;
        this.departamento_jefe = departamento_jefe;
    }
    
    public int getIdJefe(){
        return this.id_jefe;
    }
    
    public void setIdJefe(int id_jefe){
        this.id_jefe = id_jefe;
    }
    
    public String getDepartamentoJefe(){
        return this.departamento_jefe;
    }
    
    public void setDepartamentoJefe(String departamento_jefe){
        this.departamento_jefe = departamento_jefe;
    }
}
