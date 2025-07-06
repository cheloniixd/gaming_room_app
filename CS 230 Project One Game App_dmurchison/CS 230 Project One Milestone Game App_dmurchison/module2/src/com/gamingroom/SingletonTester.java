package com.gamingroom;

/**
 * A class to test a singleton's behavior
 *
 * @author coce@snhu.edu
 */
public class SingletonTester {

	public void testSingleton() {

		System.out.println("\nAbout to test the singleton...");

		// FIXED MAY21: obtain local reference to the singleton instance
		GameService service = GameService.getInstance(); // obtain singleton instance

        System.out.println("Games:");
        for (Game game : service.getGames()) {
            System.out.println(game);
        }

        System.out.println("Teams:");
        for (Team team : service.getTeams()) {
            System.out.println(team);
        }

        System.out.println("Players:");
        for (Player player : service.getPlayers()) {
            System.out.println(player);
        }
	}

}
