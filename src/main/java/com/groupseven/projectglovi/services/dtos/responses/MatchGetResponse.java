package com.groupseven.projectglovi.services.dtos.responses;

import com.groupseven.projectglovi.entities.User;
import com.groupseven.projectglovi.enums.EnumGameStatus;
import com.groupseven.projectglovi.enums.EnumGameType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MatchGetResponse {
    private User firstPlayer;
    private User secondPlayer;
    private User winnerPlayer;
    private EnumGameType gameType;
    private EnumGameStatus gameStatus;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
