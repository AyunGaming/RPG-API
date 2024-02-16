package org.example.rpgapi.errors;

public class PlayerNotFoundException extends ObjectNotFoundException{
    public PlayerNotFoundException(int id) {
        super("Player with id " + id + " not found.");
    }
}
