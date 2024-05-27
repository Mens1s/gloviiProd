package com.groupseven.projectglovi.services.dtos.responses;
import com.groupseven.projectglovi.entities.*;
import com.groupseven.projectglovi.enums.EnumGender;
import com.groupseven.projectglovi.enums.EnumRole;
import com.groupseven.projectglovi.enums.EnumUserStatus;
import com.groupseven.projectglovi.services.constants.Messages;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserGetResponse {

    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private Country country;
    private EnumGender gender;
    private EnumUserStatus status;
    private EnumRole role;
    private Rank rank;
    private Set<Car> cars;
    private Set<Racket> rackets;
    private Set<Ball> balls;
}
