/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.wegado.geometrischefolge;

/**
 *
 * @author Jan-Erik Steinmann
 * @version 1.0
 */
public class GeometrischeFolge {
    
    public static void main(String[] args) {
        long a1 = 1,an;
        byte q = 2;
        int n = 20;
        
        an = a1;
        
        System.out.println("Geometrische Folge (1 bis 20):");
        for(int i = 0; i<n; i++){
            System.out.print(" " + (int)(an));
            an *= q;
            
        }
        System.out.println("\n"+"Das 100e Glied dieser Folge ist: " + a1*Math.pow(q,99));
    }
    
}
