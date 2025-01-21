package com.swing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame() {
		
		this.setTitle("Hello Swing!"); // Sets the title of the frame.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ends the program when the frame is closed.
		this.setSize(500, 250); // Sets the X and Y dimensions of the frame.
		this.setResizable(false); // Prevents Frame from being resized.
		this.setVisible(true); // Makes the frame visible.
		
		ImageIcon image = new ImageIcon("icon_cryptoWallet.png"); // creates an ImageIcon by specifying the .png file path.
		this.setIconImage(image.getImage()); // Changes the icon of the frame.
		
		this.getContentPane().setBackground(new Color(10, 135, 84)); // Changes the background color of the frame to the RGB value (Sea Green).
	}
}
