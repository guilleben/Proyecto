
public class Perro extends Animal
{
    
    public Perro(String p_nombre, int p_edad, double p_costo, String p_estado) {
        super(p_nombre, p_edad, p_costo, p_estado);
    }
    
    
    public String emitirSonido() {
        return "Guau!";
    }
    
    /**Regresa una cadena con informacion de que tipo de animal es.
     */
    public String queAnimal() {
        return "Soy un perro";
    }
    
    
    public double precioVenta() {
        return (super.getCosto() * 1.25 + 50);
    }
}
