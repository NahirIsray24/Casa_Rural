
import java.util.*;
import java.util.Scanner;

public class casaRclass {
    //atributos 
    private String codigo=null; //cada casa tiene un codigo de hasta 5 caracteres
    private String poblacion=null;
    private String direccion=null;
    private int numhabitacion=0;
    private Double precio=0.0;
    boolean esAlta;
    public casaRclass(){
        esAlta=true;
        asigna();
    }
    public void asigna(){
         Scanner entrada= new Scanner(System.in);
        System.out.println("INGRESE EL CODIGO (5 CARACTERES)");
        codigo= entrada.nextLine();
         System.out.println("INGRESE LA POBLACION");
         poblacion= entrada.nextLine();
        System.out.println("INGRESE LA DIRECCION");
         direccion= entrada.nextLine();
         System.out.println("INGRESE NUMERO/S DE HABITACION");
         numhabitacion= entrada.nextInt();
         System.out.println("INGRESE EL PRECIO POR DIA DE LA ESTADIA");
         precio= entrada.nextDouble();
    }
    
    //metodo para mostrar los ingresos
    public void muestra(){
        
        System.out.println("CASA RURAL: "+codigo);
         System.out.println("NUMERO/S DE HABITACION: "+ numhabitacion);
          System.out.println("POBLACION DE LA CASA: "+poblacion);
          System.out.println("DIRECCION DE LA CASA: "+direccion);
          System.out.println("PRECIO POR DIA: "+precio);
        
        
        
    }
     /*
    casaRclass (String codigo,String direccion,String poblacion,int numhabitacion,Double precio){
       
        this.codigo=codigo;
        this.direccion=direccion;
        this.poblacion=poblacion;
        this.numhabitacion=numhabitacion;
        this.precio=precio;
        
        }*/
   
      
  //get y set
    //metodo para devolver el codigo
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo; //retorno del codigo: clave
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumhabitacion() {
        return numhabitacion;
    }

    public void setNumhabitacion(int numhabitacion) {
        this.numhabitacion = numhabitacion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
    
    }
    
    

