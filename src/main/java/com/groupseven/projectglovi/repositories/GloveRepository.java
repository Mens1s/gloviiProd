package com.groupseven.projectglovi.repositories;

import com.groupseven.projectglovi.entities.Country;
import com.groupseven.projectglovi.entities.Glove;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GloveRepository extends JpaRepository<Glove, Integer> {
    Optional<Glove> findGloveByName(String name);
}
