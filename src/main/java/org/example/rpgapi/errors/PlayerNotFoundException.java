package org.example.rpgapi.errors;

public class PlayerNotFoundException extends ObjectNotFoundException{
    public PlayerNotFoundException(String id) {
        super("Player with id " + id + "not found.");
    }
}
