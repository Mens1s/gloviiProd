package com.groupseven.projectglovi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.groupseven.projectglovi.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="ranks")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rank extends BaseEntity {
    @OneToOne(mappedBy = "rank")
    @JsonIgnore
    private User user;

    @Column(name="rankname")
    private Integer rank;

    @Column(name="match_count")
    private Integer match_count;
}
