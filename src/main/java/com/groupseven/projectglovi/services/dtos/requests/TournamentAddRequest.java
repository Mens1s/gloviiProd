package com.groupseven.projectglovi.services.dtos.requests;

import com.groupseven.projectglovi.enums.EnumGameStatus;
import com.groupseven.projectglovi.enums.EnumGameType;
import com.groupseven.projectglovi.services.constants.Messages;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TournamentAddRequest {
    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private String name;

    @NotNull(message = Messages.ValidationErrors.NOT_BLANK)
    private List<Integer> listOfPlayerIds;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private EnumGameType gameType;

    private EnumGameStatus gameStatus=EnumGameStatus.NOT_STARTED;
}
