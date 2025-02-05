package gameplay;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int playerAmount = new Scanner("Bienvenida y preguntar numero jugadores ").nextInt();
		Game game1 = new Game(playerAmount);
		game1.start();
	}

}
