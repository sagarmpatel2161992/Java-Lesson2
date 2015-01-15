
public class Hero extends Entity {
	
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
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	

	// Constructor
	public Hero(String name)
	{
	this.name = name;
	generateAbility();
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public void showAbilities()
	{
		System.out.println("Ability Of " + this.name + " is:");
		System.out.println("Strength:" + strength);
		System.out.println("Speed:" + getSpeed());
		System.out.println("Health:" + health);
		System.out.println();
	}
	
	private void generateAbility()
	{
		this.strength = (int) (Math.random()*100 +1);
		this.setSpeed((int) (Math.random()*100 +1));
		this.health = (int) (Math.random()*100 +1);
	}
	public void fight()
	{
		System.out.println(this.name + " is fighting");
		strength--;
		health--;
		setSpeed(getSpeed() - 1);
	}	
	public void run()
	{
		System.out.println(this.name + " is running");
		strength--;
		health--;
		setSpeed(getSpeed() - 1);
		
	}
	
	
}
