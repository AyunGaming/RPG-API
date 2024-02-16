package org.example.rpgapi.services;

import org.example.rpgapi.models.Player;
import org.example.rpgapi.repositories.PlayerRepository;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    private final PlayerRepository repository;

    public PlayerService(PlayerRepository repository){
        this.repository = repository;
    }

    public Player createPlayer(Player player) {
        return repository.save(player);
    }
}
