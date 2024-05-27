package com.groupseven.projectglovi.services.concretes;

import com.groupseven.projectglovi.entities.Racket;
import com.groupseven.projectglovi.repositories.RacketRepository;
import com.groupseven.projectglovi.services.abstracts.RacketService;
import com.groupseven.projectglovi.services.dtos.requests.RacketAddRequest;
import com.groupseven.projectglovi.services.mapper.RacketMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RacketServiceImpl implements RacketService {

    private final RacketRepository racketRepository;
    @Override
    public void add(RacketAddRequest request) {
        Racket racket = RacketMapper.INSTANCE.racketFromAddRequest(request);
        racketRepository.save(racket);
    }
}
