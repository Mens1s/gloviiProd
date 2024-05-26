package com.groupseven.projectglovi.services.concretes;

import com.groupseven.projectglovi.entities.User;
import com.groupseven.projectglovi.repositories.UserRepository;
import com.groupseven.projectglovi.services.abstracts.UserService;
import com.groupseven.projectglovi.services.dtos.requests.UserRegisterRequest;
import com.groupseven.projectglovi.services.dtos.responses.UserGetResponse;
import com.groupseven.projectglovi.services.mapper.UserMapper;
import io.jsonwebtoken.security.Password;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.security.access.AccessDeniedException;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    @Override
    public void register(UserRegisterRequest request) {
        if(userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new RuntimeException("User already exists");
        }
        User user = UserMapper.INSTANCE.userFromRegisterRequest(request);
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        userRepository.save(user);
    }

    @Override
    public UserGetResponse getUser(Integer id) {
        return UserMapper.INSTANCE.userGetResponseFromUser(userRepository.findById(id).orElseThrow());
    }

    @Override
    public List<UserGetResponse> getUsers() {
        return userRepository.findAll().stream()
                .map(UserMapper.INSTANCE::userGetResponseFromUser)
                .toList();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username).orElseThrow(() -> new AccessDeniedException("Login failed."));
    }
}
