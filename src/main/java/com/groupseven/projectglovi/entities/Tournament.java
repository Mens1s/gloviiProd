package com.groupseven.projectglovi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.groupseven.projectglovi.core.entities.BaseEntity;
import com.groupseven.projectglovi.enums.EnumGameType;
import com.groupseven.projectglovi.enums.EnumGameStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Table(name="tournaments")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tournament extends BaseEntity {
    @Column(name="name", nullable = false)
    private String name;

    @Column(name="start_date", nullable = false)
    private LocalDateTime startDate;

    @Column(name="end_date", nullable = false)
    private LocalDateTime endDate;

    @Column(name="game_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumGameType gameType;

    @Column(name="game_status")
    @Enumerated(EnumType.STRING)
    private EnumGameStatus gameStatus;

    @OneToMany(mappedBy="tournament")
    @JsonIgnore
    private Set<TournamentMatch> matches;
}
