/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARREGLOS;

/**
 *
 * @author T-101
 */
public class Arreglos1 {
    public static void main(String[] args) {
        int[]valores={1,-20,4};
        
        for(int i=0;i<valores.length;i++){
            System.out.println(valores[i]);
    }
        //este ciclo for es el mejiorado y se recomienda siempre 
        for(int v:valores){
            System.out.println(v);
        }
        //SEGUNDA FORMA DE INICIALIZAR LOS ARREGLOS 
        int otro[]=new int[4];
        for(int valor:otro){
            System.out.println(valor);}
    }
}
