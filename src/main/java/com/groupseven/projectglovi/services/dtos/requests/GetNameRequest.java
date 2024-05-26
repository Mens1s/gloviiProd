package com.groupseven.projectglovi.services.dtos.requests;


import com.groupseven.projectglovi.services.constants.Messages;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetNameRequest {
    @NotNull(message = Messages.ValidationErrors.NOT_NULL)
    private String name;

    @NotNull(message = Messages.ValidationErrors.NOT_NULL)
    private String order;
}
