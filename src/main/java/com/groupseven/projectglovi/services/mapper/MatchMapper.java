package com.groupseven.projectglovi.services.mapper;

import com.groupseven.projectglovi.entities.Match;
import com.groupseven.projectglovi.services.dtos.requests.MatchAddRequest;
import com.groupseven.projectglovi.services.dtos.responses.MatchGetResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MatchMapper {
    MatchMapper INSTANCE = Mappers.getMapper(MatchMapper.class);

    @Mapping(target = "firstPlayer.id", source = "request.firstPlayerId")
    @Mapping(target = "secondPlayer.id", source = "request.secondPlayerId")
    @Mapping(target = "winnerPlayer.id", source = "request.winnerPlayerId")
    Match matchFromMatchAddRequest(MatchAddRequest request);

    MatchGetResponse matchGetResponseFromMatch(Match match);
}
