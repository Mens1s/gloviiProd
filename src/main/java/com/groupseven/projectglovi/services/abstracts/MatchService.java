package com.groupseven.projectglovi.services.abstracts;

import com.groupseven.projectglovi.entities.Match;
import com.groupseven.projectglovi.enums.EnumGameType;
import com.groupseven.projectglovi.services.dtos.requests.MatchAddRequest;
import com.groupseven.projectglovi.services.dtos.requests.MatchEndRequest;
import com.groupseven.projectglovi.services.dtos.responses.MatchGetResponse;

import java.util.List;

public interface MatchService {
    Integer add(MatchAddRequest request);
    void end(MatchEndRequest request);
    List<Match> getList(EnumGameType type);
}
