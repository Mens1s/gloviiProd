package com.groupseven.projectglovi.repositories;

import com.groupseven.projectglovi.entities.TournamentMatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentMatchRepository extends JpaRepository<TournamentMatch, Integer> {
}
