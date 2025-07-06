package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 *
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity {

    // List of players in the team
    private List<Player> players = new ArrayList<>();

    /**
     * Constructor to initialize the team with an id and name.
     *
     * @param id   the unique identifier of the team
     * @param name the name of the team
     */
    public Team(long id, String name) {
        super(id, name);
    }

    /**
     * Adds a player to the team.
     *
     * @param name the name of the player
     * @return the newly created player
     */
	public Player addPlayer(String name) {
		// Use iterator to check if a player with the same name already exists
		for (Player existingPlayer : players) {
			if (existingPlayer.getName().equals(name)) {
				return existingPlayer; // Return the existing player if the name is already in use
			}
		}

		// If not found, create a new player and add it to the list
		Player player = new Player(GameService.getInstance().getNextPlayerId(), name);
		players.add(player);
		return player;
	}

    @Override
    public String toString() {
        return super.toString();
    }
}
