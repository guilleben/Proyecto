
/**
 * Practico n°3.ejercicio 1:Es una clase ejecutable, que crea un objeto y uno producto.
 * 
 * @author (Desiree Virasoro) 
 * @version (1.0)
 */
public class GestionStock
{
    public static void main(String [] args){
        Laboratorio lab1=new Laboratorio ("colgate","junin y jujuy","4565646");
        Producto prod=new Producto (456,"perfumeria","pañales",18,12,5,lab1);
        prod.mostrar();
        prod.ajuste(500);
        System.out.println("el stock es ahora de: "+prod.getStock());
        
    }

   
 }