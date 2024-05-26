package com.groupseven.projectglovi.services.abstracts;

import com.groupseven.projectglovi.services.dtos.requests.MatchEndRequest;
import com.groupseven.projectglovi.services.dtos.requests.TournamentMatchAddRequest;
import com.groupseven.projectglovi.services.dtos.responses.TournamentMatchGetResponse;

public interface TournamentMatchService {
    TournamentMatchGetResponse add(TournamentMatchAddRequest request);
    void end(MatchEndRequest request);

}
