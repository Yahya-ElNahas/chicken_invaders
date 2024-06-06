package objects;

public class FighterShip extends SpaceShip {
	
	public FighterShip(int x, int y, int health, int ammo)
	{
		super("Fighter", x, y, health, ammo);
		setImage("/sprites/fighterShip.png");
	}
}
