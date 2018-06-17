package com.example.worldcup.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "stage")
@EntityListeners(AuditingEntityListener.class)

public class Stage implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;


    @OneToMany(mappedBy = "stage")
    private List<Team> teams;




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
