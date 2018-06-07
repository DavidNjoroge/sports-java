package com.example.worldcup.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.rest.core.annotation.RestResource;
//import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "opponent")
@EntityListeners(AuditingEntityListener.class)
public class Opponent implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @OneToOne
    @JoinColumn(name = "team_id")
    @RestResource(path = "fixtureTeam",rel = "team")
    private Team team;

    @OneToOne(mappedBy = "opponent")
    private Fixture fixture;


}
