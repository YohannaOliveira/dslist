package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll() {
        List<Game> result = gameRepository.findAll();
        //Esse stream com os :: substitiu isso aqui: result.stream().map(x -> new GameMinDto(x)).toList();
        return result.stream().map(GameMinDto::new).toList();
    }

//    public List<Game> findById(Long id) {
//        Optional<Game> result = gameRepository.findById(id);
//        return 0;
//    }
}
