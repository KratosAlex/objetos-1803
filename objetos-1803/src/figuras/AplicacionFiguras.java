/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class AplicacionFiguras {
    
    public static void main(String[] args) {
        
        try {
            //creamos un objeto de tipo cuadrado
            
            Cuadrado c =new Cuadrado();
            
            //ajustamos el valor del lado
            ValidarValores.validarNoNegativo(4);
            c.setLado(4);
        
            //generamos un nuevo objeto de tipo calculo 
            
            Calculos cal=new Calculos();
            System.out.println();    
        } 
        
        catch (ValorNegativoException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}
