package com.groupseven.projectglovi.repositories;

import com.groupseven.projectglovi.entities.Racket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RacketRepository extends JpaRepository<Racket, Integer> {
}
