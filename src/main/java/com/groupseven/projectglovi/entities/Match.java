package com.groupseven.projectglovi.entities;

import com.groupseven.projectglovi.core.entities.BaseEntity;
import com.groupseven.projectglovi.enums.EnumGameStatus;
import com.groupseven.projectglovi.enums.EnumGameType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Table(name="matches")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Match extends BaseEntity {
    @ManyToOne
    @JoinColumn(name="first_player_id")
    private User firstPlayer;

    @ManyToOne
    @JoinColumn(name="second_player_id")
    private User secondPlayer;

    @ManyToOne
    @JoinColumn(name="match_winner_id")
    private User winnerPlayer;

    @Column(name="game_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumGameType gameType;

    @Column(name="game_status", nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumGameStatus gameStatus;

    @Column(name="start_time")
    private LocalDateTime startTime;

    @Column(name="end_time")
    private LocalDateTime endTime;

    @Column(name="collapsed_time")
    private Double collapsedTime;
}
