package com.groupseven.projectglovi.controllers;

import com.groupseven.projectglovi.services.abstracts.BallService;
import com.groupseven.projectglovi.services.abstracts.RacketService;
import com.groupseven.projectglovi.services.dtos.requests.BallAddRequest;
import com.groupseven.projectglovi.services.dtos.requests.RacketAddRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/racket")
@Validated
@RequiredArgsConstructor
public class RacketController {
    private final RacketService racketService;

    @PostMapping("/add")
    public void add(@RequestBody RacketAddRequest request){
        racketService.add(request);
    }
}
