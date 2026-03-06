/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klassdiagram;

//import java.text.Normalizer.Form;

import java.awt.Color;
import java.awt.Graphics;



/**
 *
 * @author afnka01
 */
public class Triangel extends Form {
    private int triangelArea;
    private int bas;
    private int hojd;
    private boolean fylld;
    private int startX;
    private int startY;
  /*  
int[] xPoints = { 50, 100, 150};
int[] yPoints = { 50, 100, 50};
int nHorn = 3;
    */
// 
    public Triangel(int x, int y, int bas, int hojd, boolean fylld) {
super(x,y);
this.bas=bas;
this.hojd=hojd;
this.fylld=fylld;
        triangelArea = bas*hojd/2;
        color = new Color((int)(Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255) );
    }
    public int getArea() {
        return this.triangelArea;
    }
    @Override
    public void draw(Graphics g) {
        //int[] xPoints = { Xposition, 100, 150};
        //int[] yPoints = { Yposition, 100, 50};
        int nHorn = 3;
        int[] xPoints = { Xposition-bas/2, Xposition, Xposition + bas/2 };
        int[] yPoints = { Yposition + hojd/2, Yposition - hojd/2, Yposition + hojd/2 };

     g.setColor(color);
     // Beräkna hörnorna - Utgå från att du vet ena hörnans kordinat
     g.fillPolygon(xPoints, yPoints, nHorn);
    }
    @Override
    public String WhatAmI() {
        return "Triangel";
    }
}