package com.groupseven.projectglovi.controllers;

import com.groupseven.projectglovi.services.abstracts.CarService;
import com.groupseven.projectglovi.services.dtos.requests.CarAddRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/car")
@Validated
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @PostMapping("/add")
    public void add(@RequestBody CarAddRequest request){
        carService.add(request);
    }
}
