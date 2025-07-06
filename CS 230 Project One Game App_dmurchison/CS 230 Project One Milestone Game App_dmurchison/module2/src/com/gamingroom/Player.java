package com.gamingroom;

/**
 * A simple class to hold information about a player
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a player is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Player extends Entity {
    /**
     * Constructor to initialize the player with an id and name.
     *
     * @param id   the unique identifier of the player
     * @param name the name of the player
     */
    public Player(long id, String name) {
        super(id, name); // Call the constructor of the superclass Entity
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
