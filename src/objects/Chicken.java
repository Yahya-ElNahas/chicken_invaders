package objects;

public class Chicken extends Entity {
	
	public Chicken(int x, int y, int health)
	{
		super("Chicken", x, y, 50, health);
		setImage("/sprites/chicken.png");
	}
	
	public Chicken()
	{
		this(0, 0, 100);
	}
}
