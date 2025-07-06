package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 *
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
    private static List<Game> games = new ArrayList<>();
	private static List<Team> teams = new ArrayList<>();
	private static List<Player> players = new ArrayList<>();

	/*
	 * Holds the next game identifier
	 */
    private static long nextGameId = 1;
	private static long nextPlayerId = 1;
	private static long nextTeamId = 1;

	// FIXED MAY21: Add missing pieces to turn this class a singleton
	// A private static instance of GameService (singleton instance)
    private static GameService instance;

	// Private constructor to prevent instantiation
    private GameService() {
    }

	// Public method to provide access to the singleton instance
    public static GameService getInstance() {
        if (instance == null) {
            instance = new GameService();
        }
        return instance;
    }

	/**
	 * Construct a new game instance
	 *
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// Use iterator to look for existing game with the same name
		for (Game existingGame : games) {
			if (existingGame.getName().equals(name)) {
				game = existingGame; // Assign the existing game to the local variable
				break; // Exit the loop once the game is found
			}
		}

		// If not found, create a new game instance and add it to the list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// Return the new or existing game instance to the caller
		return game;
	}

	/**
	 * Construct a new team instance
	 *
	 * @param name the unique name of the team
	 * @return the team instance (new or existing)
	 */
	public Team addTeam(String name) {
		Team team = null;

		// Check for existing team with the same name
		for (Team existingTeam : teams) {
			if (existingTeam.getName().equals(name)) {
				team = existingTeam;
				break;
			}
		}

		// If not found, create a new team
		if (team == null) {
			team = new Team(nextTeamId++, name);
			teams.add(team);
		}

		return team;
	}

	/**
	 * Construct a new player instance
	 *
	 * @param name the unique name of the player
	 * @return the player instance (new or existing)
	 */
	public Player addPlayer(String name) {
		Player player = null;

		// Check for existing player with the same name
		for (Player existingPlayer : players) {
			if (existingPlayer.getName().equals(name)) {
				player = existingPlayer;
				break;
			}
		}

		// If not found, create a new player
		if (player == null) {
			player = new Player(nextPlayerId++, name);
			players.add(player);
		}

		return player;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}

	/**
	 * Returns the game instance with the specified id.
	 *
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// FIXED MAY21: Use iterator to look for existing game with same id
			// if found, simply assign that instance to the local variable
		// Use iterator to look for existing game with the same id
		for (Game existingGame : games) {
			if (existingGame.getId() == id) {
				game = existingGame;
				break; // Exit the loop once the game is found
			}
		}

		return game;
	}

	/**
	 * Returns the team instance with the specified id.
	 *
	 * @param id unique identifier of team to search for
	 * @return requested team instance
	 */
	public Team getTeam(long id) {
		for (Team existingTeam : teams) {
			if (existingTeam.getId() == id) {
				return existingTeam;
			}
		}
		return null;
	}

	/**
	 * Returns the player instance with the specified id.
	 *
	 * @param id unique identifier of player to search for
	 * @return requested player instance
	 */
	public Player getPlayer(long id) {
		for (Player existingPlayer : players) {
			if (existingPlayer.getId() == id) {
				return existingPlayer;
			}
		}
		return null;
	}

	/**
	 * Returns the game instance with the specified name.
	 *
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// Use iterator to look for existing game with the same name
		for (Game existingGame : games) {
			if (existingGame.getName().equals(name)) {
				game = existingGame; // Assign the existing game to the local variable
				break; // Exit the loop once the game is found
			}
		}

		// Return the found game instance or null if not found
		return game;
	}

	/**
	 * Returns the number of games currently active
	 *
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}

	/**
	 * Returns the list of all teams.
	 *
	 * @return the list of teams
	 */
	public List<Team> getTeams() {
		return teams;
	}

	/**
	 * Returns the list of all players.
	 *
	 * @return the list of players
	 */
	public List<Player> getPlayers() {
		return players;
	}

	/**
	 * Returns the next unique team ID.
	 *
	 * @return the next team ID
	 */
	public long getNextTeamId() {
		return nextTeamId++;
	}

	/**
	 * Returns the next unique player ID.
	 *
	 * @return the next player ID
	 */
	public long getNextPlayerId() {
		return nextPlayerId++;
	}

	/**
	 * Returns the list of all games.
	 *
	 * @return the list of games
	 */
	public List<Game> getGames() {
		return games;
	}

}
