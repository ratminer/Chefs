import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Table table = new Table();
		Agent agent = new Agent(table);
		
		Chef peanutButter = new Chef("PeanutButter", table);
		Chef bread = new Chef("Bread", table);
		Chef jam = new Chef("Jam", table);
		
		agent.start();
		peanutButter.start();
		bread.start();
		jam.start();
	}
}
