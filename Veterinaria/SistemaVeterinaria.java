import java.util.*;
public class SistemaVeterinaria{
    public static void main (String [] args){
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese nombre veterinaria");
        String nombreVeterinaria = datos.next();
        Veterinaria unaVeterinaria = new Veterinaria(nombreVeterinaria);
        Perro unPerro = new Perro("Lassie", 5, 875, "En venta");
        unaVeterinaria.ingresarAnimal(unPerro);
        Gato unGato = new Gato("Garfield", 3, 325,"En venta");
        unaVeterinaria.ingresarAnimal(unGato);
        Perro dosPerro = new Perro("Sheppy", 1, 1850, "En venta");
        unaVeterinaria.ingresarAnimal(dosPerro);
        unaVeterinaria.venderAnimal(dosPerro);
        unaVeterinaria.verAnimales("En venta");
        unaVeterinaria.verAnimales("Vendido");
        unaVeterinaria.animalesDelTipo("Perro");
        unaVeterinaria.animalesDelTipo("Gato");
    }
}