package com.example.worldcup.controller;

import com.example.worldcup.model.Player;
import com.example.worldcup.model.Team;
import com.example.worldcup.repository.PlayerRepository;
import com.example.worldcup.repository.TeamRepository;
import com.example.worldcup.service.TeamService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/teams")
@Api(value = "allteams")
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    PlayerRepository playerRepository;

    private List<Team[]> team;

    @GetMapping("")
    public Iterable<Team> getAllTeams ( ) {
        return teamRepository.findAll ( );
    }


    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseBody
    public Team findOne (@PathVariable("name") String name) {
        return teamRepository.findByTeamName ( name );
    }

    @PostMapping(value = "/{name}")
    public Team createPlayer(@PathVariable("name") String name, @Valid @RequestBody Player[] players) {
        Team team = teamRepository.findByTeamName ( name );
        for (Player player : players) {
            player.setTeam ( team );
            playerRepository.save(player);
        }

        return teamRepository.findByTeamName ( name ) ;
    }

    @PostMapping("")
    public Team[] createTeam (@Valid @RequestBody Team[] teams) {

        System.out.println ( teams );
        for (Team team : teams) {
            teamRepository.save ( team );
        }

        return teams;
    }

    @PostMapping(value = "/bulk")
    public ResponseEntity<String> uploadAttendee (@RequestParam("file") MultipartFile file) {

        String message = "";
        return ResponseEntity.status ( HttpStatus.OK ).body ( message );
    }

//    @GetMapping("/players")
//    public Iterable<Player> getAllPlayers() {
//        return playerRepository.findAll ();
//    }
}