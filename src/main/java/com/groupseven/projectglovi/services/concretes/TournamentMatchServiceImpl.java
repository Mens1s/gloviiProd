package com.groupseven.projectglovi.services.concretes;

import com.groupseven.projectglovi.core.exception.types.BusinessException;
import com.groupseven.projectglovi.entities.Match;
import com.groupseven.projectglovi.entities.TournamentMatch;
import com.groupseven.projectglovi.entities.User;
import com.groupseven.projectglovi.repositories.TournamentMatchRepository;
import com.groupseven.projectglovi.services.abstracts.TournamentMatchService;
import com.groupseven.projectglovi.services.dtos.requests.MatchEndRequest;
import com.groupseven.projectglovi.services.dtos.requests.TournamentMatchAddRequest;
import com.groupseven.projectglovi.services.dtos.responses.TournamentMatchGetResponse;
import com.groupseven.projectglovi.services.mapper.TournamentMatchMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TournamentMatchServiceImpl implements TournamentMatchService {

    private final TournamentMatchRepository tournamentMatchRepository;
    @Override
    public TournamentMatchGetResponse add(TournamentMatchAddRequest request) {
        TournamentMatch tournamentMatch = TournamentMatchMapper.INSTANCE.matchFromTournamentMatchAddRequest(request);

        tournamentMatchRepository.save(tournamentMatch);

        return TournamentMatchMapper.INSTANCE.tournamentMatchGetResponseFromTournamentMatch(tournamentMatch);
    }

    @Override
    public void end(MatchEndRequest request) {
        Optional<TournamentMatch> optMatch = tournamentMatchRepository.findById(request.getMatchId());

        if(optMatch.isEmpty())
            throw new BusinessException("No match found given id!"); // TODO add rules

        TournamentMatch match = optMatch.get();
        User user = new User();
        user.setId(request.getWinnerPlayerId());

        match.setStartTime(request.getStartTime());
        match.setEndTime(request.getEndTime());
        match.setWinnerPlayer(user);

        tournamentMatchRepository.save(match);
    }
}
