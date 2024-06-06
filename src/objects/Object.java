package objects;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Object {

	public int x, y;
	protected int size, speed;
	protected BufferedImage image;
	
	public Object(int x, int y, int size)
	{
		this.x = x;
		this.y = y;
		this.size = size;
		this.speed = 5;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void setImage(String path)
	{
		try {
			image = ImageIO.read(getClass().getResourceAsStream(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setPos(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void move(int x, int y)
	{
		this.y += y*speed;
		this.x += x*speed;
	}
	
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(image, x - size/2, y - size/2, size, size, null);
	}
}
