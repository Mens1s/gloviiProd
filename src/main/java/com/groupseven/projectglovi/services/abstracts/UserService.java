package com.groupseven.projectglovi.services.abstracts;

import com.groupseven.projectglovi.entities.User;
import com.groupseven.projectglovi.services.dtos.requests.UserRegisterRequest;
import com.groupseven.projectglovi.services.dtos.responses.UserGetResponse;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    void register(UserRegisterRequest request);
    UserGetResponse getUser(Integer id);
    List<UserGetResponse> getUsers();
}
