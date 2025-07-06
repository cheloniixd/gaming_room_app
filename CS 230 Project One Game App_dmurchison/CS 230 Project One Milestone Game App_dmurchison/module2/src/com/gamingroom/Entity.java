package com.gamingroom;

/**
 * A base class to represent common attributes and behaviors for Game, Team, and Player.
 *
 * This class holds the unique identifier (id) and name for each entity.
 * It provides getter methods for these attributes and a toString() method for a readable representation.
 *
 * This class is intended to be extended by Game, Team, and Player classes.
 *
 */
public abstract class Entity {

    // Unique identifier for the entity
    private long id;

    // Name of the entity
    private String name;

    /**
     * Constructor to initialize the id and name of the entity.
     *
     * @param id   the unique identifier of the entity
     * @param name the name of the entity
     */
    public Entity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Returns the unique identifier of the entity.
     *
     * @return the id of the entity
     */
    public long getId() {
        return id;
    }

    /**
     * Returns the name of the entity.
     *
     * @return the name of the entity
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a string representation of the entity.
     *
     * @return a string containing the id and name of the entity
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [id=" + id + ", name=" + name + "]";
    }
}
