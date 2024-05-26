package com.groupseven.projectglovi.controllers;

import com.groupseven.projectglovi.services.abstracts.MatchService;
import com.groupseven.projectglovi.services.abstracts.TournamentService;
import com.groupseven.projectglovi.services.dtos.requests.*;
import com.groupseven.projectglovi.services.dtos.responses.TournamentMatchGetResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/tournament")
@Validated
@RequiredArgsConstructor
public class TournamentController {
    private final TournamentService tournamentService;

    @PostMapping("/start")
    public List<TournamentMatchGetResponse> startTournament(@RequestBody TournamentAddRequestString request){
        TournamentAddRequest req = new TournamentAddRequest();
        req.setName(request.getName());
        req.setGameType(request.getGameType());
        List<Integer> list = new ArrayList<>();

        for(String id : request.getListOfPlayerIds()){
            if(id != null && !id.isEmpty()){
                if(Integer.parseInt(id) > 0){
                    list.add(Integer.parseInt(id));
                }
            }
        }
        LocalDateTime localDateTime  = LocalDateTime.now();
        req.setStartDate(localDateTime);
        req.setEndDate(localDateTime);
        req.setListOfPlayerIds(list);
        return tournamentService.create(req);
    }

    @PostMapping("/get")
    public String getMatches(@RequestBody GetNameRequest request){
        String result = "";
        TournamentMatchShowResponse res = tournamentService.get(request);
        result = res.getFirstPlayerUsername() + " : " + res.getSecondPlayerUsername();
        return result;
    }


}
