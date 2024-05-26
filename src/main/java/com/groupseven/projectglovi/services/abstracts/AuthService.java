package com.groupseven.projectglovi.services.abstracts;

import com.groupseven.projectglovi.services.dtos.requests.UserLoginRequest;
import com.groupseven.projectglovi.services.dtos.requests.UserRegisterRequest;

public interface AuthService {
    void register(UserRegisterRequest request);
    String login(UserLoginRequest request);
}
