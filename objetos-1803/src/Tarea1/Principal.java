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
public class Principal {
    public static void main(String[] args) {
        
        //E1
        Threadsito t1=new Threadsito();
        t1.setName("alex");
        Threadsito t2=new Threadsito();
        t2.setName("kratos");
        Threadsito t3=new Threadsito();
         t3.setName("ronaldo");
        Threadsito t4=new Threadsito();
         t4.setName("papu");
        Relojito reloj=new Relojito();
        
         
        //estado de inicializado E2
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
       reloj.start();
    }
}
