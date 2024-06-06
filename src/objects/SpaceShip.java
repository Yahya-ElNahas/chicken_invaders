package objects;

public abstract class SpaceShip extends Entity {

	private int ammo;
	
	public SpaceShip(String name, int x, int y, int health, int ammo)
	{
		super(name, x, y, 50, health);
		this.ammo = ammo;
	}
	
	public int getAmmo()
	{
		return ammo;
	}
	
	public void fire()
	{
		new Bullet(x, y);
	}
}
