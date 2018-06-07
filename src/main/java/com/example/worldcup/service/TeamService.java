package com.example.worldcup.service;

import com.example.worldcup.model.Team;

import javax.validation.Valid;
import java.util.List;


public interface TeamService {
    List<Team> findAllTeams();

}
