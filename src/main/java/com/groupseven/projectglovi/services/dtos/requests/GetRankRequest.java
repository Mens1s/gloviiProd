package com.groupseven.projectglovi.services.dtos.requests;

import com.groupseven.projectglovi.enums.EnumGameType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetRankRequest {
    private EnumGameType type;
    private String order;
}
