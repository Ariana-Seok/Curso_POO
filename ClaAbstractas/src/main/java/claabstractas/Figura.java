package claabstractas;

// Clase abstracta

public abstract class Figura {
    // Atributos
    protected double x;
    protected double y;
    
    // Constructores
    protected Figura(){}
    
    protected Figura(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    
    // Metodos
    public abstract double calcularArea();
    
}
