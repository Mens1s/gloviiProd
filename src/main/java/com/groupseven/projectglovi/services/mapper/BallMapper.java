package com.groupseven.projectglovi.services.mapper;

import com.groupseven.projectglovi.entities.Ball;
import com.groupseven.projectglovi.services.dtos.requests.BallAddRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BallMapper {
    BallMapper INSTANCE = Mappers.getMapper(BallMapper.class);

    Ball ballFromAddRequest(BallAddRequest request);
}
