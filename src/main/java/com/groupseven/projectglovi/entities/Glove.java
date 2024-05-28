package com.groupseven.projectglovi.entities;

import com.groupseven.projectglovi.core.entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="gloves")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Glove extends BaseEntity {

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="x", nullable = false)
    private String x;

    @Column(name="y", nullable = false)
    private String y;

    @Column(name="z", nullable = false)
    private String z;

    @Column(name="buttonFirst", nullable = false)
    private String buttonFirst;

    @Column(name="buttonSecond", nullable = false)
    private String buttonSecond;
}
