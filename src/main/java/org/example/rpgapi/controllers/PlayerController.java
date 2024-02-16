package org.example.rpgapi.controllers;

import org.example.rpgapi.models.Player;
import org.example.rpgapi.services.PlayerService;
import org.springframework.web.bind.annotation.*;

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

    /**
     * Find a player with its id
     * @param id the int of the id
     * @return the player found
     */
    @GetMapping("/findById/player")
    public Player findById(@RequestParam int id){
        return service.getPlayerById(id);
    }

    /**
     * Remove a player
     * @param id the int of the id
     */
    @DeleteMapping("/deleteById/player")
    public void deleteById(@RequestParam int id){
        service.deletePlayerById(id);
    }

    /**
     * Update a player
     * @param player the player to update
     * @return the player updated
     */
    @PostMapping("update/player")
    public Player update(@RequestBody Player player){
        return service.updatePlayer(player);
    }
}
