package com.yohannaso.dslist.service;

import com.yohannaso.dslist.dto.GameListDto;
import com.yohannaso.dslist.entity.GameList;
import com.yohannaso.dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll() {
        List<GameList> games = gameListRepository.findAll();
        return games.stream().map(it -> new GameListDto(it)).toList();
    }
}