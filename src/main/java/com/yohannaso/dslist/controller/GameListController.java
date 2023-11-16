package com.yohannaso.dslist.controller;

import com.yohannaso.dslist.dto.GameListDto;
import com.yohannaso.dslist.dto.GameMinDto;
import com.yohannaso.dslist.service.GameListService;
import com.yohannaso.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDto> findAll() {
        List<GameListDto> games = gameListService.findAll();
        return games;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDto> findByList(@PathVariable Long listId) {
        List<GameMinDto> games = gameService.findByList(listId);
        return games;
    }
}
