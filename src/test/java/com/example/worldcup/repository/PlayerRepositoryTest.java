package com.example.worldcup.repository;

import com.example.worldcup.model.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PlayerRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private PlayerRepository playerRepository;

    // write test cases here

    @Test
    public void whenFindAll_thenReturnPlayers() {
        // given
//        Player laca = new Player("lacazette")
    }
}