/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klassdiagram;

import java.awt.Color;
import java.awt.Graphics;

/**
 * 
 *
 * @author afnka01
 */
public class Rektangel extends Form {

    private int bas;
    private int hojd;
    private boolean fylld; 
    private int startX;
    private int startY;
    
    public Rektangel(int x, int y, int bas, int hojd, boolean fylld) {
        super(x, y);
        this.bas = bas;
        this.hojd = hojd;
        color = new Color((int)(Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255) );

    }

    public int getArea() {
        return bas*hojd;
    }
    @Override
    public void draw(Graphics g) {
    g.setColor(color);
    g.fillRect(Xposition-bas/2, Yposition-hojd/2, bas, hojd);
    }
    @Override
    public String WhatAmI() {
        return "Rektangel";
    }

}