package com.groupseven.projectglovi.repositories;

import com.groupseven.projectglovi.entities.Ball;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BallRepository extends JpaRepository<Ball, Integer> {
}
