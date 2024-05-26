package com.groupseven.projectglovi.repositories;

import com.groupseven.projectglovi.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer> {
}
