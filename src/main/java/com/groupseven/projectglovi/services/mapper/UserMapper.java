package com.groupseven.projectglovi.services.mapper;

import com.groupseven.projectglovi.entities.*;
import com.groupseven.projectglovi.services.dtos.requests.UserRegisterRequest;
import com.groupseven.projectglovi.services.dtos.responses.UserGetResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "country", expression = "java(mapCountryIdToCountry(request.getCountryId()))")
    User userFromRegisterRequest(UserRegisterRequest request);

    UserGetResponse userGetResponseFromUser(User user);

    default Set<Car> mapCarIdsToCars(Set<Integer> carIds) {
        return carIds.stream()
                .map(carId -> {
                    Car car = new Car();
                    car.setId(carId);
                    return car;
                })
                .collect(Collectors.toSet());
    }

    default Set<Racket> mapRacketIdsToRackets(Set<Integer> racketIds) {
        return racketIds.stream()
                .map(racketId -> {
                    Racket racket = new Racket();
                    racket.setId(racketId);
                    return racket;
                })
                .collect(Collectors.toSet());
    }

    default Set<Ball> mapBallIdsToBalls(Set<Integer> ballIds) {
        return ballIds.stream()
                .map(ballId -> {
                    Ball ball = new Ball();
                    ball.setId(ballId);
                    return ball;
                })
                .collect(Collectors.toSet());
    }

    default Country mapCountryIdToCountry(Integer countryId){
        Country country = new Country();
        country.setId(countryId);
        return country;
    }
}
