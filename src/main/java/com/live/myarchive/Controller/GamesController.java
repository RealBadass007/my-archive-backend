package com.live.myarchive.Controller;


import com.live.myarchive.Games.Game;
import com.live.myarchive.Service.IGamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("games")
@CrossOrigin
public class GamesController {

    private IGamesService gamesService;

    @Autowired
    public GamesController(IGamesService gamesService) {
        this.gamesService = gamesService;
    }

    @GetMapping("mygames")
    public List<Game> getMyGames() {
        return gamesService.getMyGames();
    }

    @PostMapping("addgame")
    public void addGameToLibrary(@RequestBody Game game) {
        System.out.println("game to add => " + game.getId());
        gamesService.addGameToLibrary(game);
    }

    @PostMapping("deletegame")
    public void deletGameFromLibrary(@RequestBody Game game) {
        System.out.println("game to delete => " + game.getId());
        gamesService.deletGameFromLibrary(game);
    }
}
