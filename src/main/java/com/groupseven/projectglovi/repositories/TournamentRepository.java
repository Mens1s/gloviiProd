package com.groupseven.projectglovi.repositories;

import com.groupseven.projectglovi.entities.Tournament;
import com.groupseven.projectglovi.entities.TournamentMatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Integer> {
    Optional<Tournament> findByName(String name);
}
