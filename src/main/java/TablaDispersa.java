/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
import java.util.*;
public class TablaDispersa {
    static final double R=0.618034;//constante para la dispersion
    
    static final int TAMTABLA =101;
    
    private int numElementos; //núm de elementos que hayan la tabla,incluyendo las bajas, se almacena en la variable 
    private double factorCarga;// cuando se alcance el 0.5 se pueda generar un aviso
    private casaRclass[] tabla;
    
    //inicializacion: constructor de la tabla
    public TablaDispersa(){
        tabla= new casaRclass[TAMTABLA];
        int i;
        for (i=0; i<TAMTABLA;i++){
            tabla[i]=null;
            numElementos=0;
            factorCarga=0.0;
        }
    }
    //posicion de un elemento , explor cuadratica
    public int direccion(String clave){
        int i=0,p;
        long d;
        d= transformarClav(clave);
        // aplica aritmética modular para obtener dirección base
        p = (int)(d%TAMTABLA);
        // exploración cuadrática hasta encontrar una posición vacía (null)
        while(tabla[p]!=null && tabla[p].getCodigo().equals(clave)){ //El método equals(),se utiliza para comparar dos objetos
            i++;
            p=p+i*i;
            p=p%TAMTABLA;
        }
        return p;
    }
     long transformarClav (String clave){
        long d; //v d almacena el valor entero
        d=0; //0 min posicion de la tabla 
        int j;
        for(j=0;j<Math.min(clave.length(), 5);j++){
            d=d*27+(int)clave.charAt(j);
        }
        if(d<0){
             d=-d;
                    return d;
        }
           
    


    public void insertar(casaRclass r){
        int pos; 
        // primero se busca la posición que debe ocupar, el método direccion()devuelve la posición buscada
        pos= direccion(r.getCodigo());
        tabla[pos]=r;
        numElementos++;
        factorCarga=(double)numElementos/TAMTABLA;
        if(factorCarga>0.5){
            System.out.println("EL FACTOR DE CARGA HA SUPERADO EL 50%");
            
        }
    }
    //busqueda
     public casaRclass buscar(String clave)
        {
        casaRclass pr;
        int pos;
        pos = direccion(clave);
        pr = tabla[pos];
        if (pr != null)
        if (! pr.esAlta) pr = null;
        return pr;
        }
     //eliminar 
     public void eliminar(String clave)
    {
    int pos;
    pos = direccion(clave);
    if (tabla[pos] != null)
    tabla[pos].esAlta = false;
    }
    
}
