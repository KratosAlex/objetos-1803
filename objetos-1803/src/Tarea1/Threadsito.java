/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea1;

/**
 *
 * @author T-101
 */
public class Threadsito extends Thread{
  
    public void run() {
        System.out.println("Soy un thread y me llamo "+Thread.currentThread().getName());
    }
    
    
}