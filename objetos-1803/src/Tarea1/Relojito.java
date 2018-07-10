/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea1;

import java.time.LocalTime;

/**
 *
 * @author T-101
 */
public class Relojito extends Thread{


    public void run(){
while(true){
        LocalTime Tiempo=LocalTime.now(); 
        int hora=Tiempo.getHour();
       int minuto=Tiempo.getMinute();
       int segundo=Tiempo.getSecond();
        System.out.println("La hora es : "+hora+";"+minuto+":"+segundo);
        try{
            
            Thread.sleep(1000);
           
        }catch(InterruptedException e){
            
         }
       }
    }
    
}
