
public class Hero {
	
	// Private Properties 
	private int strength;
	private int speed;
	private int health;
	
	// Public Properties
	public String name; 
	
	// Getters
	public int getStrength() {
		return strength;
	}
	public int getSpeed() {
		return speed;
	}
	public int getHealth() {
		return health;
	}
	public String getName() {
		return name;
	}
	
	// Setters
	
	public void setStrength(int strength) {
		this.strength = strength;
	}	
	public void setSpeed(int speed) {
		this.speed = speed;
	}	
	public void setHealth(int health) {
		this.health = health;
	}	
	public void setName(String name) {
		this.name = name;		
		generateAbility();
	}
	
	// Constructor
	public Hero(String name)
	{
	this.name = name; 	
	}
	private void generateAbility()
	{
		
	}
	public void fight()
	{
		
	}	
	public void run()
	{
		
	}
	
}
