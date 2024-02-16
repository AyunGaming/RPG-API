package org.example.rpgapi.controllers;

import org.example.rpgapi.models.Player;
import org.example.rpgapi.services.PlayerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for player related actions
 */
@RestController
public class PlayerController {

    private final PlayerService service;

    /**
     * Initialize the service
     * @param service the PlayerService
     */
    public PlayerController(PlayerService service){
        this.service = service;
    }

    /**
     * Create a new player
     * @param player the player to create (passed in the body of the request)
     * @return the player created
     */
    @PostMapping("/create/player")
    public Player createPlayer(@RequestBody Player player){
        return service.createPlayer(player);
    }
}
