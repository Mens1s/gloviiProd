package com.groupseven.projectglovi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.groupseven.projectglovi.core.entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Table(name="countries")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Country extends BaseEntity {
    @Column(name="name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "country")
    @JsonIgnore
    private Set<User> users;
}
