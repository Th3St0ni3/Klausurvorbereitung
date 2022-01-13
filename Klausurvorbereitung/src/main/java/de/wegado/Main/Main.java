/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.wegado.Main;

/**
 *
 * @author Jan-Erik Steinmann
 * @version 1.0 Beta
 */
public class Main {
    
    /**
    * Summe aller Zahlen von 1 bis n entspricht {@code n*(n + 1)/2}.<br>
    * Dies soll durch dieses Programm gezeigt werden.<br><br>
    *
    * Das Ergebnis von 1 bis 100 entspricht 5050.
    * @param args wird nicht behandelt.
    */
    
    public static void main(String[] args) {
        int a=1;
        long d = 0;
        int c = 0;
        long n = 46341;
        
        for(int i=0; i<n; i++){
            c = c+a;
            a++;
        }
        d = (n*(n+1)/2);
        
        System.out.println("Summe von 1 bis " + n + ": " + c);
        System.out.println("Ergebnis des Bildungsgesetzes: " + c);
        
        if(d==c){
            System.out.println("Die Ergebnisse sind: gleich");
        } else {
            System.out.println("Die Ergebnisse sind: ungleich");
        }
        
        
        
        
        
    }
    
}
