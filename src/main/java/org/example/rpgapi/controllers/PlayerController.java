package org.example.rpgapi.controllers;

import org.example.rpgapi.models.Player;
import org.example.rpgapi.services.PlayerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    private final PlayerService service;

    public PlayerController(PlayerService service){
        this.service = service;
    }

    @PostMapping("/create/player")
    public Player createPlayer(@RequestBody Player player){
        return service.createPlayer(player);
    }
}
