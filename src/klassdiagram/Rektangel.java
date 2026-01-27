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
public class Rektangel extends Form {

    private int bas;
    private int hojd;
    private boolean fylld;
    private int startX;
    private int startY;
    
    public Rektangel(int x, int y, int hojd, int bas, boolean fylld) {
        super(x, y);
        this.bas = bas;
        this.hojd = hojd;
    }

    public int getArea() {
        return bas*hojd;
    }
    @Override
    public void draw(Graphics g) {
    g.setColor(Color.RED);
    g.fillRect(startX, startY, bas, hojd);
    }
    @Override
    public String WhatAmI() {
        return "Rektangel";
    }
}