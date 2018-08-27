package com.example.worldcup.service;

import com.example.worldcup.model.Team;

import javax.validation.Valid;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.List;


public interface TeamService {
    List<Team> findAllTeams();

//    void bulkCreate(Long voucherDefinition, int count, int amount, LocalDateTime startDate, LocalDateTime endDate, Writer writer) throws IOException;


}
