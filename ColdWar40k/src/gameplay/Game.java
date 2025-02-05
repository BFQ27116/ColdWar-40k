package gameplay;

import java.util.Scanner;

import ui.UI;

public class Game {

	public Game(int playerAmount) {
		
	}

	public void start() {
		UI.showMenu();
		starterChoice(new Scanner("Selecciona lo que deseas del Menu").nextInt());
	}

	private void starterChoice(int choice) {
		switch (choice){
			case 1:
				switch (new Scanner(UI.PLAY_OR_LOAD).nextInt()) {
				
				}
			case 2:
				UI.showRules();
			case 3:
				UI.showCredits();
			case 4: 
				UI.showRanking();
			
		}
			
		
	}

	private void loadOrCreate() {
		
		
	}

}
