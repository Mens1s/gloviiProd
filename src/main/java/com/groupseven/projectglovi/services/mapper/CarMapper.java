package com.groupseven.projectglovi.services.mapper;

import com.groupseven.projectglovi.entities.Car;
import com.groupseven.projectglovi.entities.User;
import com.groupseven.projectglovi.services.dtos.requests.CarAddRequest;
import com.groupseven.projectglovi.services.dtos.requests.UserRegisterRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    Car carFromAddRequest(CarAddRequest request);
}
