import java.util.*;
/**
 * Practico n°3.ejercicio 1:Crea un objeto producto,muestra sus valores y permmite modificarlos.
 * 
 * @author (Desiree Virasoro) 
 * @version (1.0)
 */
public class Producto
{
  private int codigo;
  private String rubro;
  private String descripcion;
  private double costo;
  private int stock;
  private double porcPtoRepo;
  private int existMinima;
  private Laboratorio laboratorio;
  
  public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_existMinima, Laboratorio p_lab){
      this.setCodigo(p_codigo);
      this.setRubro(p_rubro);
      this.setDescripcion(p_desc);
      this.setCosto(p_costo);
      this.setPorcPtoRepo(p_porcPtoRepo);
      this.setExistMinima(p_existMinima);
      this.setLaboratorio(p_lab);
      this.setStock(0);

  }
  public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab){
      this.setCodigo(p_codigo);
      this.setRubro(p_rubro);
      this.setDescripcion(p_desc);
      this.setCosto(p_costo);
      this.setPorcPtoRepo(0.0);
      this.setExistMinima(0);
      this.setLaboratorio(p_lab);
      this.setStock(0);

  }
  //declaracion de setters
  private void setCodigo(int p_codigo){
    this.codigo=p_codigo;
    }
  private void setRubro(String p_rubro){
    this.rubro=p_rubro;
   }
  private void setDescripcion(String p_desc){
    this.descripcion=p_desc;
   }
   private void setCosto(double p_costo){
    this.costo=p_costo;
  }
  private void setStock(int p_stock){
    this.stock=p_stock;
  }
  private void setPorcPtoRepo( double p_porcPtoRepo){
    this.porcPtoRepo=p_porcPtoRepo;
    }
  private void setExistMinima(int p_exisMinima){
    this.existMinima=p_exisMinima;
   }
  private void setLaboratorio(Laboratorio p_lab){
    this.laboratorio=p_lab;
    }
  //declaracion de los getters
  public int getCodigo(){
    return this.codigo;
  }
  public String getRubro(){
    return this.rubro;
  }
  public String getDescripcion(){
    return this.descripcion;
  }
  public double getCosto(){
    return this.costo;
  }
  public int getStock(){
    return this.stock;
  }
  public double getPorcPtoRepo(){
    return this.porcPtoRepo;
  }
  public int getExisMinima(){
    return this.existMinima;
  }
  public Laboratorio getLaboratorio(){
    return this.laboratorio;
  }
  //metodos
  /**Muestra los atributos del obejto. 
  * @throws no dispara ninguna excepcion.
  * @param no recibe parametros.
  */
  public void mostrar(){
    this.getLaboratorio().mostrar();
    System.out.println("Rubro: "+this.getRubro());
    System.out.println("Descripcion: "+this.getDescripcion());
    System.out.println("Precio costo: "+this.getCosto());
    System.out.println("Stock: "+this.getStock()+"- Stock valorizado:"+this.stockValorizado());
    }
  /**Agrega o quita productos del stock.   
  * @throws no dispara ninguna excepcion 
  * @param int p_cantidad 
  */
  public void ajuste(int p_cantidad){
    int respuesta;
    Scanner tecla=new Scanner(System.in);
    System.out.println("si desea agregar precione 1 y para quitar 0");
    respuesta=tecla.nextInt();
    if(respuesta==1){
        this.setStock(this.getStock()+ p_cantidad);
    }
    else if(respuesta==0){
        this.setStock(this.getStock()- p_cantidad);
    }
     }
  /**Devuele el resultado de multiplicar el stock por el precio de costo,más una rentabilidad del 12%.
  * @return double
  * @throws no dispara ninguna excepcion 
  * @param no recibe parametros
  */
  public double stockValorizado(){
     double porcentaje;
     porcentaje=((this.getStock()*this.getCosto())*0.12);
     return (this.getStock()*this.getCosto())+porcentaje;
    }
  /**<Devuelve el valor que que resulta de agregar el 12% al precio de costo.
  * @return double 
  * @throws no dispara ninguna excepcion 
  * @param no recibe parametros
  */
  public double precioLista(){
     double porcentaje=0;
     porcentaje=this.getCosto()*0.12;
     return this.getCosto()+porcentaje;
    }
  /**REsta un 5% al precio de lista(pago al contado del producto).
  * @return double 
  * @throws no dispara ninguna excepcion 
  * @param no recibe parametros
  */
  public double precioContado(){
    double porcentaje=0;
    porcentaje=this.precioLista()*0.05;
    return this.precioLista()-porcentaje;
   }
  /**Muestra una linea .
  * @return String  
  * @throws no dispara ninguna excepcion 
  * @param no recibe parametros
  */
  public String mostrarLinea(){
    return this.getDescripcion()+"     "+this.precioLista()+this.precioContado();
    }
  /**Ajusta la reposicion del producto.  
  * @throws no dispara ninguna excepcion 
  * @param double p_porce
  */
  public void ajustarPtoRepo(double p_porce){
    this.setPorcPtoRepo(p_porce);
  }
  /**Ajusta la existencia minima del producto.   
  * @throws no dispara ninguna excepcion 
  * @param int p_cantidad
  */
  public void ajustarExistMin(int p_cantidad){
    this.setExistMinima(p_cantidad);
    }
   
 }
  
