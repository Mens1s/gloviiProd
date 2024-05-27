package com.groupseven.projectglovi.services.concretes;

import com.groupseven.projectglovi.entities.Car;
import com.groupseven.projectglovi.repositories.CarRepository;
import com.groupseven.projectglovi.services.abstracts.CarService;
import com.groupseven.projectglovi.services.dtos.requests.CarAddRequest;
import com.groupseven.projectglovi.services.mapper.CarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Override
    public void add(CarAddRequest request) {
        Car car = CarMapper.INSTANCE.carFromAddRequest(request);
        carRepository.save(car);
    }

}
