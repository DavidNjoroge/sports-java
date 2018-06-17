package com.example.worldcup.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Player implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String names;


    @NotBlank
    private String position;

    @NotBlank
    private String club;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="team_id")
    private Team team;

    public Long getId ( ) {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getNames ( ) {
        return names;
    }

    public void setNames (String names) {
        this.names = names;
    }

    public String getPosition ( ) {
        return position;
    }

    public void setPosition (String position) {
        this.position = position;
    }

    public String getClub ( ) {
        return club;
    }

    public void setClub (String club) {
        this.club = club;
    }

    public Team getTeam ( ) {
        return team;
    }

    public void setTeam (Team team) {
        this.team = team;
    }
}
