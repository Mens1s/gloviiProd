package com.groupseven.projectglovi.services.dtos.requests;

import com.groupseven.projectglovi.entities.Rank;
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
public class UserRegisterRequest {
    @NotNull(message = Messages.ValidationErrors.NOT_NULL)
    private String username;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL)
    private String firstName;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL)
    private String lastName;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL)
    private String email;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL)
    private String password;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private Integer countryId;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL)
    private EnumGender gender;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL)
    private EnumUserStatus status;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL)
    private EnumRole role;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL)
    private Rank rank;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private Set<Integer> cars;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private Set<Integer> rackets;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private Set<Integer> balls;
}
