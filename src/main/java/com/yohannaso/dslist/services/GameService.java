package com.yohannaso.dslist.services;

import com.yohannaso.dslist.dto.GameMinDto;
import com.yohannaso.dslist.entities.Game;
import com.yohannaso.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll() {
        List<Game> games = gameRepository.findAll();
        return games.stream().map(it -> new GameMinDto(it)).toList();
    }
}
