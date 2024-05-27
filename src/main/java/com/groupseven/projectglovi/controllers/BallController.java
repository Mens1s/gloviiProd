package com.groupseven.projectglovi.controllers;

import com.groupseven.projectglovi.services.abstracts.BallService;
import com.groupseven.projectglovi.services.dtos.requests.BallAddRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ball")
@Validated
@RequiredArgsConstructor
public class BallController {
    private final BallService ballService;

    @PostMapping("/add")
    public void add(@RequestBody BallAddRequest request){
        ballService.add(request);
    }
}
