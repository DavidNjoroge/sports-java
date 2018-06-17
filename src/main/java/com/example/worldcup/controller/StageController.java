package com.example.worldcup.controller;

import com.example.worldcup.model.Stage;
import com.example.worldcup.model.Team;
import com.example.worldcup.repository.StageRepository;
import com.example.worldcup.service.StageService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/stages")
@Api(value = "stages")
public class StageController {

    @Autowired
    StageRepository stageRepository;

//    @Autowired
//    StageService stageService;

    @GetMapping("")
    public List<Stage> getAllTeams() {
        return stageRepository.findAll ();
    }



}


