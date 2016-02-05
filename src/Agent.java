import java.util.Random;

public class Agent extends Thread {

	private Table table;

	boolean running;
	
	public Agent(Table table) {
		this.table = table;
		running = true;
	}

	public void run() {
		Random rand = new Random();
		
		for(int i = 0; i < 20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			switch (rand.nextInt(3)) {
			case 0:
				table.put("Jam and Bread");
				System.out.println("putting Jam and Bread on the table");
				break;
			case 1:
				table.put("PeanutButter and Bread");
				System.out.println("putting PeanutButter and Bread on the table");
				break;
			case 2:
				table.put("PeanutButter and Jam");
				System.out.println("putting PeanutButter and Jam on the table");
				break;
			}
		}
	}
	
	public void exit(){
		running = false;
	}
}