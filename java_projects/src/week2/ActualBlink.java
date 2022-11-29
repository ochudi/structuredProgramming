/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import java.awt.Color;

/**
 *
 * @author macbook
 */
public class ActualBlink implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 1; i < 100; i--){
                ClockApp.jLabel2.setForeground(Color.red);
                Thread.sleep(10);
                ClockApp.jLabel2.setForeground(Color.green);
                Thread.sleep(10);
                ClockApp.jLabel2.setForeground(Color.yellow);
                Thread.sleep(10);
                ClockApp.jLabel2.setForeground(Color.black);
                Thread.sleep(10);
            }
        } catch (Exception e){
            
        }
    }
    
}
