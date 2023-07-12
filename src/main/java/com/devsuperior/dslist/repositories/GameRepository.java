package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
