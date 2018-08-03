/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofinal;

/**
 *
 * @author T-101
 */
public class Area {
    
    private Figura figura;
    
    
   public float AreaCuadrado(){
       
      

       float resultado= figura.getLado()*figura.getLado();
       return resultado;
}
   
    public float AreaTriangulo(){
       
      

       float resultado= figura.getBase()*figura.getAltura();
       return resultado;
}
    
    
}
