package com.example.worldcup.repository;

import com.example.worldcup.model.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long> {
}
