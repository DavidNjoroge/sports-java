package com.example.worldcup.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "fixtures")
@EntityListeners(AuditingEntityListener.class)

public class Fixture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String matchday;

    @NotBlank
    @OneToOne
    @JoinColumn(name = "team_id")
    @RestResource(path = "fixtureTeam",rel = "team")
    private Team team;

    @NotBlank
    @OneToOne
    @JoinColumn(name = "opponent_id")
    @RestResource(path = "fixtureOpponent",rel = "opponent")
    private Opponent opponent;

    @NotBlank
    private String standings;

}
