package com.groupseven.projectglovi.controllers;

import com.groupseven.projectglovi.entities.User;
import com.groupseven.projectglovi.services.abstracts.UserService;
import com.groupseven.projectglovi.services.dtos.responses.UserGetResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@Validated
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/getAll")
    public List<UserGetResponse> getAll(){
        return userService.getUsers();
    }

    @GetMapping("/get/{id}")
    public UserGetResponse getUser(@PathVariable(name="id") Integer id){
        return userService.getUser(id);
    }
}
