package vezbe2;

import java.util.Scanner;

public class ExplorersGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Welcome to the explorer game!");
		System.out.println("What is your name?");
		String name = scanner.next();
		System.out.println(name + ", where do you want to go? ");
		String destination = scanner.next();
		
		Explorer explorer = new Explorer(name,destination);
		
		System.out.println("The game begins!");
		
		while(explorer.isAlive()) {
			explorer.explore();
			
			if(!explorer.isAlive()) {
				System.out.println("Explorer perished, game over!");
				explorer.explorerDied();
				continue;
			}
			
			if(explorer.getKnowledge() >= 100) {
				System.out.println("Congrats, you are very lucky!");
				break;
			}
			
			System.out.println("After " + explorer.getTurn() + " days of exploration we currently have following stats:");
			System.out.println("Supplies: " + explorer.getSupplies());
			System.out.println("Knowledge: " + explorer.getKnowledge());
			System.out.println("If you want to continue press 1, otherwise you are going home!");
			
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				continue;
			}else {
				break;
			}
		}
		
		System.out.println("Your final score is: " + explorer.getKnowledge());
		scanner.close();
	}

}
