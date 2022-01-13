/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.wegado.geom;

import java.util.HashSet;

/**
 *
 * @author stein
 */
public class TestQuader {
    public static void main(String[] args) {
        Quader quad1 = new Quader(12.5, 10.5, 7);
        
        Quader quad2 = new Quader(5.8, 15.2, 10.5);
        
        double v1 = quad1.getVolumen();
        double v2 = quad2.getVolumen();
                
        
        
        if (v1 > v2)
            System.out.println("Das Volumen von Quader 1 ist größer. Es beträgt " + v1 + " VE. Das von Quader 2 nur " + v2 + " VE.");
        else if (v2 > v1)
            System.out.println("Das Volumen von Quader 2 ist größer. Es beträgt " + v2 + " VE. Das von Quader 1 nur " + v1 + " VE.");
        else 
            System.out.println("Beide Quader haben das selbe Volumen. Es beträgt " + v1 + " VE.\n");
        
        
        
        System.out.println(quad1.getHöhe());
        System.out.println(quad2.getHöhe());
        quad1.setHöhe(11.6);
        System.out.println(quad1.getHöhe());
        System.out.println(quad2.getHöhe());
        
    }
}
