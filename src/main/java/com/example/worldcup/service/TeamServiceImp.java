package com.example.worldcup.service;

import com.example.worldcup.model.Team;
import com.example.worldcup.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImp implements TeamService {
    @Autowired
    TeamRepository teamRepository;

    @Override
    public List<Team> findAllTeams() {
        return teamRepository.findAll();
    }

}
