/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import java.util.Date;

/**
 *
 * @author macbook
 */
public class ActualTime implements Runnable{

    @Override
    public void run() {
        try {
            for(int i = 1; i < 1000; i--){
                ClockApp.jLabel2.setText(new Date().toString());
                Thread.sleep(100);
            }
        } catch (Exception e) {
            
        }
    }
    
}
