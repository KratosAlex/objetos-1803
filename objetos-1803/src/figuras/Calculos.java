/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author T-101
 */
public class Calculos {
    
 public String calculArarea(Cuadrado c){
 float area=c.getLado()*c.getLado();
 return "El Area es; "+area;
 }
    public String calculPerimetro(Cuadrado c){
 float perimetro=4*c.getLado();
 return "El Perimetro es; "+perimetro;
 }
}
