package com.groupseven.projectglovi.services.mapper;

import com.groupseven.projectglovi.entities.Tournament;
import com.groupseven.projectglovi.services.dtos.requests.TournamentAddRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TournamentMapper {
    TournamentMapper INSTANCE = Mappers.getMapper(TournamentMapper.class);

    Tournament tournamentFromTournamentAddRequest(TournamentAddRequest request);
}
