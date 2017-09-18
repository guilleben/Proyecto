
public class Gato extends Animal
{
    
    public Gato(String p_nombre, int p_edad, double p_costo, String p_estado) {
        super(p_nombre, p_edad, p_costo, p_estado);
    }
    
   
    public String emitirSonido() {
        return "Miau!";
    }
    
    
    public String queAnimal() {
        return "Soy un gato";
    }
    
}
