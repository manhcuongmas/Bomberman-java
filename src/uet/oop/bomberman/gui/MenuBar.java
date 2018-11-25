/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uet.oop.bomberman.gui;

import javax.swing.JMenuBar;

/**
 *
 * @author Administrator
 */
public class MenuBar extends JMenuBar{
    public MenuBar(Frame frame) {
		add( new Menu(frame) );
		add( new Options(frame) );
		
	}

    
}
