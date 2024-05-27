package com.groupseven.projectglovi.services.mapper;

import com.groupseven.projectglovi.entities.Racket;
import com.groupseven.projectglovi.services.dtos.requests.RacketAddRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RacketMapper {
    RacketMapper INSTANCE = Mappers.getMapper(RacketMapper.class);

    Racket racketFromAddRequest(RacketAddRequest request);
}
