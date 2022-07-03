package com.calitzgames.bored.window;
import java.awt.*;
import java.awt.event.*;

public class Window extends MouseAdapter{
	Frame frame;
	public Window() {
		frame = new Frame("Json Displayer");
		frame.addMouseListener(this);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent code) {
				frame.dispose();
			}
		});

		frame.setSize(800, 600);
		frame.setLayout(null);
		frame.setVisible(true);

	}

	public void mouseClicked(MouseEvent click){
		Graphics graphics = frame.getGraphics();
		graphics.setColor(Color.CYAN);
		graphics.fillOval(click.getX(), click.getY(), 30,30);
	}

}
