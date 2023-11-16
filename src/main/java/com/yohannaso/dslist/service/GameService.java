package com.yohannaso.dslist.service;

import com.yohannaso.dslist.dto.GameDto;
import com.yohannaso.dslist.dto.GameMinDto;
import com.yohannaso.dslist.entity.Game;
import com.yohannaso.dslist.projection.GameMinProjection;
import com.yohannaso.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        List<Game> games = gameRepository.findAll();
        return games.stream().map(it -> new GameMinDto(it)).toList();
    }

    @Transactional(readOnly = true)
    public GameDto findById(Long id) {
        Game gameById = gameRepository.findById(id).get();
        return new GameDto(gameById);
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findByList(Long listId) {
        List<GameMinProjection> games = gameRepository.searchByList(listId);
        return games.stream().map(it -> new GameMinDto(it)).toList();
    }
}
