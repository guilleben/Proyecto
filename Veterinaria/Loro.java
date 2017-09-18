
public class Loro extends Animal
{
    private boolean habla;
    
    
    public Loro(String p_nombre, int p_edad, double p_costo, String p_estado, boolean p_habla) {
        super(p_nombre, p_edad, p_costo, p_estado);
        this.setHabla(p_habla);
    }
   
    public boolean getHabla() {
        return this.habla;
    }
    
    private void setHabla(boolean valor) {
        this.habla = valor;
    }
    
    
    public String emitirSonido() {
        boolean habla = this.getHabla();
        if (habla) {
            return (super.getNombre() + " Hola");
        } else {
            return "Prrack!";
        }
    }
    
    
    public String queAnimal() {
        return "Soy un loro";
    }
    
    
    public double precioVenta() {
        boolean habla = this.getHabla();
        if (habla) {
            return (super.getCosto() * 1.25 + 70);
        } else {
            return (super.getCosto() * 1.25);
        }
    }
}
