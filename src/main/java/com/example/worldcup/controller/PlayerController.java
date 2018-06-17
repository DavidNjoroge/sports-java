package com.example.worldcup.controller;


import com.example.worldcup.model.Player;
import com.example.worldcup.repository.PlayerRepository;
import com.example.worldcup.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    TeamRepository teamRepository;

    @GetMapping("/players")
    public Iterable<Player> getAllPlayers() {
        return playerRepository.findAll ();
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Player> findByTeam (@PathVariable("name") String name) {
        return playerRepository.findByTeam (teamRepository.findByTeamName ( name ));
    }
}
