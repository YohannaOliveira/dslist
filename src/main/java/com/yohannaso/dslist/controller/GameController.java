package com.yohannaso.dslist.controller;


import com.yohannaso.dslist.dto.GameDto;
import com.yohannaso.dslist.dto.GameMinDto;
import com.yohannaso.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDto> findAll() {
        List<GameMinDto> games = gameService.findAll();
        return games;
    }

    @GetMapping("/{id}")
    public GameDto findById(@PathVariable Long id) {
        GameDto game = gameService.findById(id);
        return game;
    }
}
