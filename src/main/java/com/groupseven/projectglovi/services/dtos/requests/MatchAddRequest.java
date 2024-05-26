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
public class MatchAddRequest {
    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private Integer firstPlayerId;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private Integer secondPlayerId;

    private Integer winnerPlayerId;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private EnumGameType gameType;

    private EnumGameStatus gameStatus=EnumGameStatus.NOT_STARTED;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Double collapsedTime;

}
