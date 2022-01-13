/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.wegado.geom;

/**
 *
 * @author Jan-Erik Steinmann
 * @version 1.0
 */
public class Quader {
    double länge, breite, höhe;
    
    public Quader(double breite, double länge, double höhe){
        this.breite = breite;
        this.länge = länge;
        this.höhe = höhe;
    }
       public double getBreite() {
        return breite;
    }

   public double getHöhe() {
        return höhe;
    }

   public double getLänge() {
        return länge;
    }
    
    public double getVolumen(){
        double v;
        v = länge*breite*höhe;
        
        return v;
    }
    
    public double getMantelfläche(){
        double A;
        A = 2*(länge*höhe+breite*höhe);
        
        return A;
    }
    
    public double getOberfläche(){
        double A;
        A = this.getMantelfläche()+2*(länge*breite);
        
        return A;
    }
    
    public double getRaumdiagonale(){
        double d;
        
        d= Math.sqrt(Math.pow(länge,2)+Math.pow(breite,2)+Math.pow(höhe,2));
        
        return d;
    }
    
    public void setLänge(double länge){
        this.länge = Math.abs(länge);
    }
    
    public void setHöhe(double höhe){
        this.höhe = Math.abs(höhe);
    }
    
    public void setBreite(double breite){
        this.breite = Math.abs(breite);
    }
    
    public void setParameter(double länge, double breite, double höhe){
        this.länge = länge;
        this.breite = breite;
        this.höhe = höhe;
    }
}
