package Logica;

public abstract class Pokemon {
    // Utilizamos 'protected' porque van a heredar los atributos
    // de esta clase.
    
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniaso();
    protected abstract void atacarMordisco();
    
    
}
