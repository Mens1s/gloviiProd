package com.groupseven.projectglovi.core.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@MappedSuperclass // no need to additional table inherited entities
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name = "create_dae")
    private LocalDateTime createDate;

    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    @Column(name = "deleted_date")
    private LocalDateTime deletedDate;

    @PrePersist
    public void onCreate(){
        this.createDate = LocalDateTime.now();
    }

    @PreUpdate
    public void onUpdate(){
        this.updatedDate = LocalDateTime.now();
    }

    @PreRemove
    public void onDelete(){
        this.deletedDate = LocalDateTime.now();
    }
}
