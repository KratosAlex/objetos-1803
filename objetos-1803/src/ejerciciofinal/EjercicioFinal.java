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
public class EjercicioFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Cuadrado c=new Cuadrado();
        Triangulo t=new Triangulo();
        Circulo ci=new Circulo();
        t.setAltura(20);
        t.setBase(40);
        c.setLado(25);
        ci.setRadio(0);
        
        Area area=new Area();
        Perimetro perimetro=new Perimetro();
        System.out.println(area.AreaCuadrado());
        System.out.println(area.AreaTriangulo());
    
    
    }
    
}
