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
    
int[] xPoints = { 50, 100, 0};
int[] yPoints = { 50, 100, 0};
int nHorn = 3;
    
// 
    public Triangel(int x, int y, int bas, int hojd, boolean fylld) {
super(x,y);
this.bas=bas;
this.hojd=hojd;
        triangelArea = bas*hojd/2;
    }
    
    public int getArea() {
        return this.triangelArea;
    }
    @Override
    public void draw(Graphics g) {
     g.setColor(Color.GREEN);
     g.fillPolygon(xPoints, yPoints, nHorn);
    }
    
    @Override
    public String WhatAmI() {
        return "Triangel";
    }
}



