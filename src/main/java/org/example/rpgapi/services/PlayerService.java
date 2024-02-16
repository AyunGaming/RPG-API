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
     * @param player the player to add
     * @return the player created
     */
    public Player createPlayer(Player player) {
        return repository.save(player);
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
}
