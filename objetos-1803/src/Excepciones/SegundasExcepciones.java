/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author T-101
 */
public class SegundasExcepciones {
    public static void main(String[] args) {
        int a=2;
        int b=2;
        
        int arrego[]={1,2};
        
        try{
        String numeromalo="cuatro";
        int numerobueno=Integer.parseInt(numeromalo);
         
        System.out.println(a/b);
        System.out.println(numerobueno*2);
            System.out.println(arrego[1]);}    
  catch(Exception e){
            System.out.println("Vemos que excepcio ocurree "+e.getMessage());
    }
    
}
}