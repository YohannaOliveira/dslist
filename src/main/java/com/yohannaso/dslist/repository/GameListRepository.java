package com.yohannaso.dslist.repository;

import com.yohannaso.dslist.entity.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
