/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etc;

import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class GeneraTarjetas {
    
   private ArrayList<Cliente>clientes;

   
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes ;  
    }
    
     public GeneraTarjetas() {
       clientes=new ArrayList<>();
       clientes.add (new Cliente("Juan",new Tarjeta(1234,"BANAMEX",32000)));
      clientes.add (new Cliente("Ana",new Tarjeta(5678,"HSBC",17500))); 
       clientes.add (new Cliente("Juan",new Tarjeta(8765,"SCOTIA",19600)));
    clientes.add (new Cliente("Juan",new Tarjeta(4321,"BANCOMER",48000)));   
     }

}
