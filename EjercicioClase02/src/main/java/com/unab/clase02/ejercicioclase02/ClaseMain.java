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
        
     Profesor profe = new Profesor("William", "El Praiso", "11/14/94", "M", 25, "ING", "PROGRAMADOR");
        System.out.println(profe.toString());
   
    Estudiante est = new Estudiante("William", "San Rafael", "30/10/2001", "M", 18, 1500, "Ing. Sistemas y Computacion");
        System.out.println(est.toString());
    }
    
    
}
