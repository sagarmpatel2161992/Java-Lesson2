
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
	public void showAbilities()
	{
		System.out.println("Ability Of Here IS:");
		System.out.println("Strength:" + strength);
		System.out.println("Speed:" + speed);
		System.out.println("Health:" + health);
		System.out.println();
	}
	
	private void generateAbility()
	{
		this.strength = Integer.parseInt("Math.random()*100 +1");
		this.speed = Integer.parseInt("Math.random()*100 +1");
		this.health = Integer.parseInt("Math.random()*100 +1");
	}
	public void fight()
	{
		System.out.println(this.name + " is fighting");	
	}	
	public void run()
	{
		System.out.println(this.name + " is running");
	}
	
}
