/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads3;

import java.time.LocalTime;

/**
 *
 * @author T-101
 */
public class Aplicacaion {
    public static void main(String[] args) {
        
        Thread t1=new Thread(new Runnable(){
            
            public void run(){
                while(true){
           LocalTime time=LocalTime.now();
            int hora=time.getHour();
       int minuto=time.getMinute();
       int segundo=time.getSecond();
        System.out.println("La hora es : "+hora+";"+minuto+":"+segundo);
        try{
            
            Thread.sleep(1000);
           
        }catch(InterruptedException e){
            
         }
        
      }
            
            }
            });
        
        t1.start();
        
        
    }
 }
