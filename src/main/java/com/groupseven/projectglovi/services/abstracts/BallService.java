package com.groupseven.projectglovi.services.abstracts;

import com.groupseven.projectglovi.services.dtos.requests.BallAddRequest;

public interface BallService {
    void add(BallAddRequest request);
}
