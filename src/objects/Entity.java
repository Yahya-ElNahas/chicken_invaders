package objects;

public abstract class Entity extends Object {

	private String name;
	private int health;
	
	public Entity(String name, int x, int y, int size, int health)
	{
		super(x, y, size);
		this.name = name;
		this.health = health;
	}

	public String getName()
	{
		return name;
	}
	
	public int getHealth()
	{
		return health;
	}
}
