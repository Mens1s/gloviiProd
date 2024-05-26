package com.groupseven.projectglovi.services.dtos.requests;

import com.groupseven.projectglovi.entities.Tournament;
import com.groupseven.projectglovi.enums.EnumGameStatus;
import com.groupseven.projectglovi.enums.EnumGameType;
import com.groupseven.projectglovi.services.constants.Messages;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TournamentMatchAddRequest {
    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private Integer firstPlayerId;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private Integer secondPlayerId;

    private Integer winnerPlayerId;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private EnumGameType gameType;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private String name;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private Integer tournamentId;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private Integer matchOrder;

    private EnumGameStatus gameStatus=EnumGameStatus.NOT_STARTED;

    private LocalDateTime startTime;

    private LocalDateTime endTime;
}
