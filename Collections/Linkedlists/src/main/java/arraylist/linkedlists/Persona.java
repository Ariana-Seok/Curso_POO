
package arraylist.linkedlists;


public class Persona {
    private int num;
    private String nombre;
    private int edad;
    
    // Constructores
    
    public Persona(){}
    
    public Persona(int num, String nombre, int edad){
        this.num = num;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Getters and Setters
    
    public int getNum(){
        return this.num;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
}
