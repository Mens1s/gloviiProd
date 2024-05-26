package com.groupseven.projectglovi.services.concretes;

import com.groupseven.projectglovi.entities.Ball;
import com.groupseven.projectglovi.repositories.BallRepository;
import com.groupseven.projectglovi.services.abstracts.BallService;
import com.groupseven.projectglovi.services.dtos.requests.BallAddRequest;
import com.groupseven.projectglovi.services.mapper.BallMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BallServiceImpl implements BallService {
    private final BallRepository ballRepository;
    @Override
    public void add(BallAddRequest request) {
        Ball ball = BallMapper.INSTANCE.ballFromAddRequest(request);
        ballRepository.save(ball);
    }
}
