
public class Chef extends Thread {

	private String currentlyHave;

	private Table table;

	private String neededIngredients;

	boolean running;
	
	public Chef(String ingredient, Table table) {
		this.currentlyHave = ingredient;
		this.table = table;
		neededIngredients = lookingFor(currentlyHave);
		running = true;
	}

	private String lookingFor(String alreadyHave) {
		if (alreadyHave == "PeanutButter") {
			return "Jam and Bread";
		} else if (alreadyHave == "Jam") {
			return "PeanutButter and Bread";
		} else if (alreadyHave == "Bread") {
			return "PeanutButter and Jam";
		}
		return null;
	}

	public void run() {
		while (running) {
			if (table.check().equals(neededIngredients)) {
				table.get();
				System.out.println("Chef " + currentlyHave + " is eating");
			}
		}
	}
	
	public void exit(){
		running = false;
	}
}
