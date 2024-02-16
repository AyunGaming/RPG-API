package org.example.rpgapi.models;

import jakarta.persistence.*;

/**
 * Simple player class
 */

@Entity
@Table(name="player")
public class Player {

    //region Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int level;

    private int experience;

    private int health;
    //endregion

    //region Properties
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public int getHealth() {
        return health;
    }
    //endregion

    //region Constructors
    public Player(String name) {
        this.name = name;
    }

    public Player() {
    }
    //endregion
}
