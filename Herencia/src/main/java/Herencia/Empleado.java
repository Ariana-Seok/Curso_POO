package Herencia;

public class Empleado extends Persona {
    int num_legajo;
    String cargo;
    Double sueldo;
    
    //Constructores
    
    public Empleado(){}
    
    public Empleado(int num_legajo, String cargo, Double sueldo,
            int id,String dni, String nombre, String apellido, String domicilio,
            String telefono){
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    
    public int getNumLegajo(){
        return this.num_legajo;
    }
    
    public void setNumLegajo(){
        this.num_legajo = num_legajo;
    }
    
    public String getCargo(){
        return this.cargo;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public Double getSueldo(){
        return this.sueldo;
    }
        
    public void setSueldo(Double sueldo){
        this.sueldo = sueldo;
    }
    
    
}
