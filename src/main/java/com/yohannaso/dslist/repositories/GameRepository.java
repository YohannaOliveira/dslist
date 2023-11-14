package com.yohannaso.dslist.repositories;

import com.yohannaso.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {


}
