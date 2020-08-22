/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase02.ejercicioclase02;

/**
 *
 * @author FAMILIA
 */
public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//         Profesor profe = new Profesor("Willam", "El_Paraiso", "14/11/94", "m", 25, "ing", "PROGRAMADOR");
//        System.out.println(profe.toString());

        
        Estudiante est = new Estudiante("Willam", "San Rafael", "03/10/2001", "M", 18, 1500, "ING. Sistemas y Computacion");
        
        System.out.println(est.toString());
    
    }
    
}
