package com.groupseven.projectglovi.services.dtos.requests;


import com.groupseven.projectglovi.enums.EnumGameType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TournamentMatchShowResponse {
    private String firstPlayerUsername;
    private String secondPlayerUsername;
    private EnumGameType gameType;
}
