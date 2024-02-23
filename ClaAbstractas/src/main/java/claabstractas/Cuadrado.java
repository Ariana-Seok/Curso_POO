package claabstractas;

public class Cuadrado extends Figura{
    private double lado;
    
    // Constructor
    public Cuadrado(){}
    
    public Cuadrado(double lado, double x, double y){
        super(x, y);
        this.lado = lado;
    }
    
    
    //SobreEscritura
    @Override
    public double calcularArea(){
        double resultado = lado * lado;
        return resultado;
    }
}
