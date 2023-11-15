package com.yohannaso.dslist.dto;

import com.yohannaso.dslist.entity.GameList;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GameListDto {

    private Long id;
    private String name;

    public GameListDto(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }
}
