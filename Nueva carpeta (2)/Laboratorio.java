/**
 * Practico n�3.ejercicio 1: Crea un objeto Labotorio, permite modificar el dia de entrega y la compra minima.
 * 
 * @author (Desiree Virasoro) 
 * @version (1.0)
 */
public class Laboratorio{
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega; 
    
    
    public Laboratorio(String p_nombre, String p_domicilio,String p_telefono, int p_compraMin,int p_diaEnt){        
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMin);
        this.setDiaEntrega(p_diaEnt);
    }
    public Laboratorio(String p_nombre, String p_domicilio,String p_telefono){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(0);
        this.setDiaEntrega(0);
    }
    //Declaracion de setters
    private void setNombre (String p_nombre){
        this.nombre = p_nombre;
    }
    private void setDomicilio (String p_domicilio){
        this.domicilio = p_domicilio;
    }
    private void setTelefono (String p_telefono){
        this.telefono = p_telefono;
    }
    private void setCompraMinima (int p_compraMin){
        this.compraMinima = p_compraMin;
    }
    private void setDiaEntrega (int p_diaEnt){
        this.diaEntrega = p_diaEnt;
    }
    //Declaracion de getters
    public String getNombre(){
        return this.nombre;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
     public String getTelefono(){
        return this.telefono;
    }
    public int getCompraMinima(){
        return this.compraMinima;
    }
    public int getDiaEntrega(){
        return this.diaEntrega;
    }
    //metodos
    /** Modifica y/o ajusta la compra mínima.
     * @return no devuelve ningún valor.
     * @param int p_compraMin
     * @throws No dispara ninguna acción.
     */
    public void ajusteCompraMinima(int p_compraMin){
        this.setCompraMinima(p_compraMin);
    } 
    
    /** Modifica y/ajusta el día de la entrega.
     * @return No retorna ningún valor.
     * @param int p_diaEnt.
     * @throws No dispara ninguna acción.
     */
    public void ajusteDiaEntrega(int p_diaEnt){
        this.setDiaEntrega (p_diaEnt);
    }
   
    /** Permite mostrar en pantalla las caracteristica del objeto laboratorio.
     *  @throws No dispara ninguna acción.
     */
    public void mostrar (){
        System.out.println ("Laboratorio: " + this.getNombre());
        System.out.println ("Domicilio: "+ this.getDomicilio() + 
                         " - Telefono: " + this.getTelefono());
    }
   
}