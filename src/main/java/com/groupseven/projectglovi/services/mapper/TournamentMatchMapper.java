package com.groupseven.projectglovi.services.mapper;

import com.groupseven.projectglovi.entities.TournamentMatch;
import com.groupseven.projectglovi.services.dtos.requests.TournamentMatchAddRequest;
import com.groupseven.projectglovi.services.dtos.responses.TournamentMatchGetResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TournamentMatchMapper {
    TournamentMatchMapper INSTANCE = Mappers.getMapper(TournamentMatchMapper.class);

    @Mapping(target = "firstPlayer.id", source = "request.firstPlayerId")
    @Mapping(target = "secondPlayer.id", source = "request.secondPlayerId")
    @Mapping(target = "winnerPlayer.id", source = "request.winnerPlayerId")
    @Mapping(target = "tournament.id", source = "request.tournamentId")
    TournamentMatch matchFromTournamentMatchAddRequest(TournamentMatchAddRequest request);

    TournamentMatchGetResponse tournamentMatchGetResponseFromTournamentMatch(TournamentMatch match);
}
