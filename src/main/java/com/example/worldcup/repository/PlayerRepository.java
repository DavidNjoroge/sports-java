package com.example.worldcup.repository;

import com.example.worldcup.model.Player;
import com.example.worldcup.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

//    @Query("SELECT * FROM world_cup.player where team_id = 15")
//    Iterable<Player> findByTeam (Integer id);

    Iterable<Player> findByTeam (Team name);
}
