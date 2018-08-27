package com.example.worldcup.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "team")
@EntityListeners(AuditingEntityListener.class)
public class Team implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String teamName;

    @NotBlank
    private String confederation;

//    @NotBlank
    @JsonIgnore
    @OneToMany(mappedBy = "team")
    public List<Player> players;

//    @ManyToOne
//    @JoinColumn(name="stage_id")
//    private Stage stage;

    public Long getId ( ) {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getTeamName ( ) {
        return teamName;
    }

    public void setTeamName (String teamName) {
        this.teamName = teamName;
    }

    public String getConfederation ( ) {
        return confederation;
    }

    public void setConfederation (String confederation) {
        this.confederation = confederation;
    }

    public List<Player> getPlayers ( ) {
        return players;
    }

    public void setPlayers (List<Player> players) {
        this.players = players;
    }
//
//    public Stage getStage ( ) {
//        return stage;
//    }
//
//    public void setStage (Stage stage) {
//        this.stage = stage;
//    }
}

