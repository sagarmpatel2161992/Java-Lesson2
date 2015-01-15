
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
	

	// Constructor
	public Hero(String name)
	{
	this.name = name;
	generateAbility();
	}
	public void showAbilities()
	{
		System.out.println("Ability Of " + this.name + " is:");
		System.out.println("Strength:" + strength);
		System.out.println("Speed:" + speed);
		System.out.println("Health:" + health);
		System.out.println();
	}
	
	private void generateAbility()
	{
		this.strength = (int) (Math.random()*100 +1);
		this.speed = (int) (Math.random()*100 +1);
		this.health = (int) (Math.random()*100 +1);
	}
	public void fight()
	{
		System.out.println(this.name + " is fighting");
		strength--;
		health--;
		speed--;
	}	
	public void run()
	{
		System.out.println(this.name + " is running");
		strength--;
		health--;
		speed--;
		
	}
	
}
