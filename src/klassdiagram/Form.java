/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klassdiagram;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author afnka01
 */
public abstract class Form implements Serializable {

    protected int Xposition;
    protected int Yposition;
    protected boolean running = false;
    protected boolean positivRiktning;
    protected Color color;
    protected boolean Höger = true;
    protected int width;

    public Form(int x, int y) {
        Xposition = x;
        Yposition = y;
        color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));

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

    public void setRunning(boolean run) {
        this.running = run;
    }

    public void setWidth(int w) {
        this.width = w;
    }

    public void movE(int x, int y) {
        if (Höger) {
         Xposition += 5;
         if (Xposition > width ) {
             Höger=false;
             
         }
        } else {
            Xposition-=5;
        }
        if (Xposition<0) {
            Höger=true;
        }
    }
            // System.out.println("move "+Xposition);
            // if (Xposition > width) {
            //    Höger = false;
            // } else {
            //    Xposition -= 5;
            //    if (Xposition < 000) {
            //        Höger = true;
             //   }
           // }
       // }
   // }

    public abstract void draw(Graphics g);

    public abstract String WhatAmI();

    public abstract double getArea();
}
