package com.groupseven.projectglovi.services.concretes;

import com.groupseven.projectglovi.core.exception.types.BusinessException;
import com.groupseven.projectglovi.entities.User;
import com.groupseven.projectglovi.jwt.JwtService;
import com.groupseven.projectglovi.repositories.UserRepository;
import com.groupseven.projectglovi.services.abstracts.AuthService;
import com.groupseven.projectglovi.services.abstracts.UserService;
import com.groupseven.projectglovi.services.dtos.requests.UserLoginRequest;
import com.groupseven.projectglovi.services.dtos.requests.UserRegisterRequest;
import com.groupseven.projectglovi.services.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final UserService userService;

    @Override
    public void register(UserRegisterRequest request) {
        userService.register(request);
    }

    @Override
    public String login(UserLoginRequest request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
        );

        if(!authentication.isAuthenticated())
            throw new BusinessException("Mail or password is wrong");

        UserDetails user = userService.loadUserByUsername(request.getEmail());

        return jwtService.generateToken(user.getUsername(), user.getAuthorities().stream().map(GrantedAuthority::getAuthority).toList());
    }
}
