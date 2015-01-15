
public class Speedster extends Hero {

	
	// Constructor
	public Speedster(String name) {
		super(name);
		boostSpeed();
		// TODO Auto-generated constructor stub
	}

	//Private Mothod
	private void boostSpeed()
	{
		this.setSpeed(this.getSpeed() + 50);
		
		if(this.getSpeed() > 100)
		{
			this.setSpeed(100);
		}
	}
}
