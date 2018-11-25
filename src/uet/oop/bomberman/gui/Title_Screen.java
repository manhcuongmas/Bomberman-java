/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uet.oop.bomberman.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import uet.oop.bomberman.Game;

/**
 *
 * @author Administrator
 */
public class Title_Screen {
    
    
    public void render(Graphics g) {
        Font fnt0 = new Font("arial", Font.BOLD, 50);
        g.setFont(fnt0);
        g.setColor(Color.WHITE);
        g.drawString("BOMBERMAN", Game.WIDTH / 2, 100);
    
    
    }
 
    
}
