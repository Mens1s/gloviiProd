package com.groupseven.projectglovi.services.mapper;

import com.groupseven.projectglovi.entities.Country;
import com.groupseven.projectglovi.services.dtos.requests.CountryAddRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CountryMapper {
    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    Country countryFromAddRequest(CountryAddRequest request);
}
