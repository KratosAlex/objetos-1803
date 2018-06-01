/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores2;

import javax.swing.JFrame;

/**
 *
 * @author T-101
 */
public class probarcontructores2 {
    public static void main(String[] args) {
        persona p1=new persona("alex");
        persona p2=new persona();
        JFrame ventanita=new JFrame("HOLA MUNDO");
        ventanita.setSize(300,300);
        ventanita.setVisible(true);
}
}