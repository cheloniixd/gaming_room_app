package com.gamingroom;
import java.util.ArrayList;
import java.util.List;
/**
 * A simple class to hold information about a game
 *
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 *
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity {
	long id;
	String name;

	// list of teams in the game
	private List<Team> teams = new ArrayList<>();

    /**
     * Constructor to initialize the game with an id and name.
     *
     * @param id   the unique identifier of the game
     * @param name the name of the game
     */
    public Game(long id, String name) {
        super(id, name);
    }

    /**
     * Adds a team to the game.
     *
     * @param name the name of the team
     * @return the newly created team
     */
	public Team addTeam(String name) {
		// Use iterator to check if a team with the same name already exists
		for (Team existingTeam : teams) {
			if (existingTeam.getName().equals(name)) {
				return existingTeam; // Return the existing team if the name is already in use
			}
		}

		// If not found, create a new team and add it to the list
		Team team = new Team(GameService.getInstance().getNextTeamId(), name);
		teams.add(team);
		return team;
	}

    @Override
    public String toString() {
        return super.toString();
    }

}
