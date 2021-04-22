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
    static final double R=0.618034;
    
    static final int TAMTABLA =101;
    private int numElementos;
    private double factorCarga;
    private casaR[] tabla;
    //inicializacion de la tabla
    public TablaDispersa(){
        tabla= new casaR[TAMTABLA];
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
        while(tabla[p]!=null && tabla[p].getCodigo().equals(clave)){
            i++;
            p=p+i*i;
            p=p%TAMTABLA;
        }
        return p;
    }
     long transformarClav (String clave){
        long d;
        d=0;
        int j;
        for(j=0;j<Math.min(clave.length(), 5);j++){
            d=d*27+(int)clave.charAt(j);
        }
        if(d<0){
             d=-d;
                    return d;
        }
           
    

    //inserccion
    public void insertar(casaR r){
        int pos; 
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
