


//import casaRclass;
//import casaRclass;
import java.util.Scanner;

public class CasaRmain {
     //static final int TAMTABLA = 101; //el tamaño elegido es el número primo 101
     public static void main(String[] args) {
         //creamos e inicializamos nuestra tabla dispersa
       tabladispersa tabla= new  TablaDispersa();
               //creo una nueva casa rural 
       
       casaRclass casa =new casaRclass();
       casaRclass buscado = tabla.buscar("hsjol");
       
       int pos = tabla.direccion("ahsha");
       System.out.println(pos);
               
               
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
                    tabla.eliminar();
                  
                    
                break;
                
                case 3:
                    buscado.muestra();
                    break;
                   
                    
            }
            System.out.println("  PARA SALIR PRESIONE 0  ");
             salir =entrada.nextInt();
        }
while( salir != 0);
     }
 

}
