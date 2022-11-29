/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2_AccessModifiers1;

/**
 *
 * @author macbook
 */
public class PARENTCLASS {
    private String name = "Chukwudi Peter OFOMA.";
    int age = 21;
    protected String matriculationNumber = "20120612023";
    public String gender = "Male";
    
    public static void main(String[] args) {
        PARENTCLASS newParent1 = new PARENTCLASS();
        System.out.println(newParent1.name);
    }
}
