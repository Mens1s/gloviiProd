package com.groupseven.projectglovi.services.abstracts;

import com.groupseven.projectglovi.entities.Tournament;
import com.groupseven.projectglovi.services.dtos.requests.GetNameRequest;
import com.groupseven.projectglovi.services.dtos.requests.TournamentAddRequest;
import com.groupseven.projectglovi.services.dtos.requests.TournamentMatchShowResponse;
import com.groupseven.projectglovi.services.dtos.responses.TournamentMatchGetResponse;

import java.util.List;

public interface TournamentService {
    List<TournamentMatchGetResponse> create(TournamentAddRequest request);
    TournamentMatchShowResponse get(GetNameRequest t);
}
