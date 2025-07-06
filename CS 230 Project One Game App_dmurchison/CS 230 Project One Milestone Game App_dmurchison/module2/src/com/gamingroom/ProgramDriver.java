package com.gamingroom;

/**
 * Application start-up program
 *
 * @author coce@snhu.edu
 */
public class ProgramDriver {

	/**
	 * The one-and-only main() method
	 *
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		// FIXED MAY21: obtain reference to the singleton instance
        GameService service = GameService.getInstance();

        System.out.println("\nAbout to test initializing game data...");

        // Add games
        Game game1 = service.addGame("Game #1");
        System.out.println(game1);

        Game game2 = service.addGame("Game #2");
        System.out.println(game2);

        // Add teams to the first game
        Team team1 = game1.addTeam("Team Alpha");
        System.out.println(team1);

        Team team2 = game1.addTeam("Team Beta");
        System.out.println(team2);

        // Add players to the first team
        Player player1 = team1.addPlayer("Player One");
        System.out.println(player1);

        Player player2 = team1.addPlayer("Player Two");
        System.out.println(player2);

        // Attempt to add a duplicate player
        Player duplicatePlayer = team1.addPlayer("Player One");
        System.out.println(duplicatePlayer); // Should return the existing player

        // Add players to the second team
        Player player3 = team2.addPlayer("Player Three");
        System.out.println(player3);

        Player player4 = team2.addPlayer("Player Four");
        System.out.println(player4);

        // Attempt to add a duplicate team
        Team duplicateTeam = game1.addTeam("Team Alpha");
        System.out.println(duplicateTeam); // Should return the existing team

        // Use SingletonTester to verify singleton behavior
        SingletonTester tester = new SingletonTester();
        tester.testSingleton();
	}
}
