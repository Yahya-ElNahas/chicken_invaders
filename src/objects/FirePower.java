package objects;

public abstract class FirePower extends Object {

	private int damage;
	
	public FirePower(int x, int y, int size, int damage)
	{
		super(x, y, size);
		this.damage = damage;
	}
	
	public int getDamage()
	{
		return damage;
	}
}
