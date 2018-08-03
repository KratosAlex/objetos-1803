package ejerciciofinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T-101
 */
public class Figura {
   
 private  float Lado; 
 private   float Base;
 private   float Altura;
 private   float Radio;
 
   
   public float CalcularArea;

    public float getLado() {
        return Lado;
    }

    public void setLado(float Lado) {
        this.Lado = Lado;
    }

    public Figura(float Base, float Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    public Figura(float Base) {
        this.Base = Base;
    }

    public float getBase() {
        return Base;
    }

    public void setBase(float Base) {
        this.Base = Base;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    public float getRadio() {
        return Radio;
    }

    public void setRadio(float Radio) {
        this.Radio = Radio;
    }

    public float getCalcularArea() {
        return CalcularArea;
    }

   
}
