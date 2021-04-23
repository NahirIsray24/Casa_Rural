

//import casaRclass;
//import casaRclass;
import java.util.Scanner;

public class CasaRmain {
     //static final int TAMTABLA = 101; //el tamaño elegido es el número primo 101
     public static void main(String[] args) {
         //creamos e inicializamos nuestra tabla dispersa
       TablaDispersa tabla= new  TablaDispersa();
               //creo el objeto casa de la clase tabla dispersa 
       
       casaRclass casa =new casaRclass();
       //creo el objeto casa de la clase casaRclass
       casaRclass buscado = tabla.buscar("hsjol");
       
       int pos = tabla.direccion("ahsha");
       System.out.println(pos);
               String codigo;
               
        Scanner entrada= new Scanner(System.in);
      int opcion,salir;
    
    do{
            
            System.out.println("       MENU        ");
            System.out.println("  1- INSERTAR CASA  ");
            System.out.println("  2- ELIMINAR CARA ");
            System.out.println("  3- BUSCAR CASA  ");
            
            opcion =entrada.nextInt();
   
            switch(opcion){
                
                case 1:
                    tabla.insertar(casa); 
                    
                    
                    
                break;
                
                case 2:
                     System.out.println("INGRESE EL CODIGO DE LA CASA A ELIMINAR");
                     codigo=entrada.next();
                try{
                 System.out.println("---casa ELIMINADA ---");
                  tabla.eliminar(codigo); 
                }
                 catch(Exception e){
                    System.out.println("CASA NO EXISTENTE");
                }
                  
                  
                    
                break;
                
                case 3:
                    //uso de try y catch Try=Tratar, catch=atrapar,


                     System.out.println("INGRESE EL CODIGO PARA PODER BUSCAR LA CASA:");
                     codigo = entrada.next();
                         try{
                         buscado.muestra();
                     }
                    catch(Exception e){
                    System.out.println("CASA NO EXISTENTE ");
                     }
                    break;
                   
                    
                    }
                    System.out.println("  PARA SALIR PRESIONE 0  ");
                     salir =entrada.nextInt();
                }
                while( salir != 0);
     }
 

}
