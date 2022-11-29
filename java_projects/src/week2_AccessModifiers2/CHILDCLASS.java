/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2_AccessModifiers2;

import week2_AccessModifiers1.PARENTCLASS;

/**
 *
 * @author macbook
 */
public class CHILDCLASS extends PARENTCLASS {
    public static void main(String[] args) {
        CHILDCLASS newChild1 = new CHILDCLASS();
        System.out.println(newChild1.gender);
        System.out.println(newChild1.matriculationNumber);
    }
}
