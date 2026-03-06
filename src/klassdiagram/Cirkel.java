/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klassdiagram;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author afnka01
 */
public class Cirkel extends Form {
    
    private int radie;
    private boolean fylld;
    private int startX;
    private int startY;
    
    public Cirkel(int x, int y, int radie, boolean fylld) {
        
        super(x, y);
        this.radie = radie;
        this.fylld = fylld;
        color = new Color((int)(Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255) );

    }
  
 
    }
    @Override
    public void draw(Graphics g) {
      g.setColor(color);
      g.fillOval(Xposition, Yposition, radie, radie);
      
    }
    @Override
    public String WhatAmI() {
        return "Cirkel";
    }

@Override
public double getArea() {
return (radie*radie)* Math.PI;

   // Anropa metoden draw i en annan klass
   // Skriv rent av samma 2 kodrader i även triangel och rektangel
}