package com.example.worldcup.service;

import com.example.worldcup.model.Stage;
import com.example.worldcup.model.Team;
import com.example.worldcup.repository.StageRepository;
import com.example.worldcup.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StageServiceImp implements StageService {
    @Autowired
    StageRepository stageRepository;

    @Override
    public List<Stage> findAllStages() {
        return stageRepository.findAll();
    }

}
