/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etc;



/**
 *
 * @author T-101
 */
public class ProbarClientes {
    public static void main(String[] args) {
        
        for(Cliente c:new GeneraTarjetas().getClientes()){
            System.out.println(c);
        
        }
    }
    
}
