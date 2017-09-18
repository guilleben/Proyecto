import java.util.*;

public class Veterinaria
{
    private String nombre;
    private ArrayList animales;

    public Veterinaria(String p_nombre) {
        this.setNombre(p_nombre);
        this.setAnimales(new ArrayList());
    }

    public String getNombre() {
        return this.nombre;
    }


    public ArrayList getAnimales() {
        return this.animales;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }


    private void setAnimales(ArrayList p_animales) {
        this.animales = p_animales;
    }

    public boolean ingresarAnimal(Animal p_animal) {
        return this.getAnimales().add(p_animal);
    }


    public boolean quitarAnimal(Animal p_animal) {
        return this.getAnimales().remove(p_animal);
    }

    public void venderAnimal(Animal p_animal) {
        int index = this.getAnimales().indexOf(p_animal);
        ((Animal) this.getAnimales().get(index)).setEstado("Vendido");
    }

    public double recaudacion() {

        double total = 0;
        int cantAnimal = this.getAnimales().size();
        for (int i=0; i < cantAnimal; i++) {

            if (((Animal) this.getAnimales().get(i)).getEstado().equals("Vendido")) {
                total = total + ((Animal) this.getAnimales().get(i)).precioVenta();
            }
        }
        return total;
    }

    public void verAnimales(String p_estado) {
        System.out.println("********* Animales " + p_estado + " de " + this.getNombre() + " *********");
        int cantAnimal = this.getAnimales().size();
        for (int i=0; i < cantAnimal; i++) {

            if (((Animal) this.getAnimales().get(i)).getEstado().equals(p_estado)) {
                ((Animal) this.getAnimales().get(i)).mostrar();
                System.out.println(" ");
            }
        }
    }

    public void animalesDelTipo(String p_tipo) {

        int cantidad = 0;
        System.out.println("********* Todos los  " + p_tipo + " de " + this.getNombre() + " *********");
        int cantAnimal = this.getAnimales().size();
        for (int i=0; i < cantAnimal; i++) {
            if (((Animal) this.getAnimales().get(i)).getClass().getName().equals(p_tipo)) {
                System.out.println("Mi nombre es " + ((Animal) this.getAnimales().get(i)).getNombre() +
                    " y tengo " + ((Animal) this.getAnimales().get(i)).getEdad() + " anios");
                System.out.println("Precio de venta: " + ((Animal) this.getAnimales().get(i)).precioVenta());
                System.out.println(" ");
                cantidad = cantidad + 1;
            }
        }
        System.out.println("---------- hay " + cantidad + " " + p_tipo);
    }
}




