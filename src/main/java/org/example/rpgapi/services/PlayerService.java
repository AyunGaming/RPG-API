package org.example.rpgapi.services;

import org.example.rpgapi.errors.PlayerNotFoundException;
import org.example.rpgapi.models.Player;
import org.example.rpgapi.repositories.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service to access to player's repository
 */
@Service
public class PlayerService {
    private final PlayerRepository repository;

    public PlayerService(PlayerRepository repository){
        this.repository = repository;
    }

    /**
     * Add a new player in the repository
     * @param name the name of the player
     * @return the player created
     */
    public Player createPlayer(String name) {
        Player p = new Player(name);
        return repository.save(p);
    }

    /**
     * Find a player with its id
     * @param id the int of the id
     * @return the player founded
     * @throws PlayerNotFoundException if player not found
     */
    public Player getPlayerById(int id){
        var p = repository.findById(id);

        if(p.isEmpty()){
            throw new PlayerNotFoundException(id);
        }
        return p.get();
    }

    /**
     * Remove a player form the repository
     * @param id the int of the id
     */
    public void deletePlayerById(int id){
        repository.deleteById(id);
    }

    /**
     * Update a player in the repository
     * @param player the player to update
     * @return the player updated
     */
    public Player updatePlayer(Player player){
        return repository.save(player);
    }
}
