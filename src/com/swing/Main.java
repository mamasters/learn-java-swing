package com.swing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		/*
		// JFrame = a GUI Window to add components to.
		
		JFrame frame = new JFrame(); // Creates a frame.
		frame.setTitle("Hello Swing!"); // Sets the title of the frame.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ends the program when the frame is closed.
		frame.setSize(500, 250); // Sets the X and Y dimensions of the frame.
		frame.setResizable(false); // Prevents Frame from being resized.
		frame.setVisible(true); // Makes the frame visible.
		
		ImageIcon image = new ImageIcon("icon_cryptoWallet.png"); // creates an ImageIcon by specifying the .png file path.
		frame.setIconImage(image.getImage()); // Changes the icon of the frame.
		
		frame.getContentPane().setBackground(new Color(10, 135, 84)); // Changes the background color of the frame to the RGB value (Sea Green).
		*/
		
		new MyFrame();
		
	}

}
