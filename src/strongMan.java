
public class strongMan extends Hero {

	public strongMan(String name) {
		super(name);
		boostStrength();
		// TODO Auto-generated constructor stub
	}
	
	private void boostStrength()
	{
		this.setStrength(this.getStrength() + 50);
		
		if(this.getStrength() > 100)
		{
			this.setStrength(100);
		}
	}

}
