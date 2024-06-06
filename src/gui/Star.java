package gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Star extends JPanel {

	protected int x, y; 
	protected static int diameter = 2;
	
	public Star(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Star()
	{
		this(0, 0);
	}
	
	public void draw(Graphics g) 
	{
		g.setColor(Color.WHITE);
		g.fillOval(x, y, diameter, diameter);
	}
	
	protected void decr()
	{
		++y;
	}
}
