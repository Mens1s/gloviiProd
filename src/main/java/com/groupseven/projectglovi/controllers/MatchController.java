package com.groupseven.projectglovi.controllers;

import com.groupseven.projectglovi.entities.Match;
import com.groupseven.projectglovi.services.abstracts.MatchService;
import com.groupseven.projectglovi.services.dtos.requests.GetRankRequest;
import com.groupseven.projectglovi.services.dtos.requests.MatchAddRequest;
import com.groupseven.projectglovi.services.dtos.requests.MatchEndRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/match")
@Validated
@RequiredArgsConstructor
public class MatchController {
    private final MatchService matchService;

    @PostMapping("/start")
    public Integer startMatch(@RequestBody MatchAddRequest request){
        request.setCollapsedTime( Double.parseDouble(request.getCollapsedTimeString()));
        return matchService.add(request);
    }

    @PutMapping("/end")
    public void endMatch(@RequestBody MatchEndRequest request){
        matchService.end(request);
    }

    @PostMapping("/getRank")
    public String getRanks(@RequestBody GetRankRequest request){
        List<Match> res = matchService.getList(request.getType());
        int order = Integer.parseInt(request.getOrder());

        if(res.isEmpty() || res.size() < order){
            throw  new RuntimeException();
        }

       // return res.get(order).getWinnerPlayer().getUsername() + " : " + res.get(order).getCollapsedTime();
        //return reversed
        return res.get(res.size() - order-1).getWinnerPlayer().getUsername() + " : " + res.get(res.size() - order-1).getCollapsedTime();
    }
}
