
public class Project {
	
	public static void main(String args[]) {
		Hero saggy = new Hero("Sagar");
		saggy.showAbilities();
		saggy.run();
		saggy.fight();
		saggy.showAbilities();
		
		
		//Villain instantiated
		
		Villain villain = new Villain("Sly Man");
		villain.run();
		villain.steals();
		villain.showAbilities();
	}

}
