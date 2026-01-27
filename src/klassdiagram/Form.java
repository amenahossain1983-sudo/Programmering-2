/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klassdiagram;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author afnka01
 */
public abstract class Form {

    protected int Xposition;
    protected int Yposition;
    protected boolean running;
    protected boolean positivRiktning;
    protected Color color;
    
    public Form(int x, int y) {
        Xposition = x;
        Yposition = y;
    }
    public int getXpos(int Xposition) {
        return Xposition;
    }
    public int getYpos(int Yposition) {
        return Yposition;
    } 
    public Point getPos(Point pos) {
        return new Point(Xposition, Yposition);
    }
    public void setRunning( boolean run) {
        this.running= run;
    }
    public void movE(int x, int y) {
    }
    public abstract void draw(Graphics g);
    public abstract String WhatAmI(); 
}
   // public abstract int getArea();
