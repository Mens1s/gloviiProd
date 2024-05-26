package com.groupseven.projectglovi.services.dtos.requests;

import com.groupseven.projectglovi.enums.EnumGameStatus;
import com.groupseven.projectglovi.enums.EnumGameType;
import com.groupseven.projectglovi.services.constants.Messages;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MatchEndRequest {
    @NotNull(message = Messages.ValidationErrors.NOT_BLANK)
    private Integer matchId;

    @NotNull(message = Messages.ValidationErrors.NOT_BLANK)
    private Integer winnerPlayerId;

    private EnumGameStatus gameStatus=EnumGameStatus.ENDED;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private LocalDateTime startTime;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private LocalDateTime endTime;
}