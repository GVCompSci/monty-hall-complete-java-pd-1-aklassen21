import java.util.Random;
import java.util.Scanner;

public class MontyHallA {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner kb = new Scanner(System.in);
		int winDoorNum;
		int goatDoorNum;
		int winStatus;
		int doorNum;
		
		System.out.println("How many rounds should be simulated?");
		int roundCount = Integer.parseInt(kb.nextLine());
		int winCount = 0;
		
		String playerSwitch = "-";
		System.out.println("Should the player \"stay\" or \"switch\"?");
		playerSwitch = kb.nextLine();
		while (!(playerSwitch.equals("switch")) && !(playerSwitch.equals("stay"))) {
			System.out.println("Should the player \"stay\" or \"switch\"?");
			playerSwitch = kb.nextLine();
		}
		
		
		for(int i = 0; i < roundCount; i++) {
			winDoorNum = rand.nextInt(3) + 1;
			doorNum = winDoorNum;
			doorNum = rand.nextInt(3) + 1;
			
			
			if(playerSwitch.equals("switch")) {
				if(doorNum == winDoorNum) {
					winStatus = 0;
				} else {
					winStatus = 1;
					winCount++;
				}
			} else if(playerSwitch.equals("stay")){
				if(doorNum == winDoorNum) {
					winStatus = 1;
					winCount++;
				} else {
					winStatus = 0;
				}
			}
		}
		System.out.println("The player won " + winCount + "/" + roundCount + " games (" + ((double) winCount * 100.0 / (double) roundCount) + "%)!");
		
	}

}
