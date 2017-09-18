
public abstract class Animal
{
    private String nombre;
    private int edad;
    private double costo;
    private String estado;

    public Animal(String p_nombre, int p_edad, double p_costo, String p_estado)
    {
        this.setNombre(p_nombre);
        this.setEdad(p_edad);
        this.setCosto(p_costo);
        this.setEstado(p_estado);
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public double getCosto(){
        return this.costo;
    }

    public String getEstado(){
        return this.estado;
    }

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    private void setEdad(int p_edad){
        this.edad = p_edad;
    }

    private void setCosto(double p_costo){
        this.costo = p_costo;
    }

    public void setEstado(String p_estado){
        this.estado = p_estado;
    }

    public abstract String emitirSonido();

    public abstract String queAnimal();

    public double precioVenta() {
        return (this.getCosto() * 1.25);
    }

    public void mostrar() {
        System.out.println(this.queAnimal());
        System.out.println(this.emitirSonido());
        System.out.println("Mi nombre es " + this.getNombre() + " y tengo " + this.getEdad() + " anios");
        System.out.println("Precio de venta: " + this.precioVenta());
    }
}
