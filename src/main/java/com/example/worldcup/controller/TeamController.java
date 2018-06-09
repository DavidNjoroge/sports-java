package com.example.worldcup.controller;

import com.example.worldcup.model.Team;
import com.example.worldcup.repository.TeamRepository;
import com.example.worldcup.service.TeamService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/teams")
@Api(value = "allteams")
public class TeamController {

    @Autowired
    TeamService teamService;

    @Autowired
    TeamRepository teamRepository;

    @GetMapping("")
    public List<Team> getAllTeams() {
        return teamService.findAllTeams();
    }

    @PostMapping("")
    public Team createTeam(@Valid @RequestBody Team team) {
        return teamRepository.save(team);
    }

}

