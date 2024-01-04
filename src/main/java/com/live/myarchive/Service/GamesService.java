package com.live.myarchive.Service;


import com.live.myarchive.Games.Game;
import com.live.myarchive.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesService implements IGamesService {

    private GameRepository gameRepository;

    @Autowired
    public GamesService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public List<Game> getMyGames() {
        return gameRepository.findAll();
    }

    @Override
    public void addGameToLibrary(Game game) {
        gameRepository.save(game);
    }

    @Override
    public void deletGameFromLibrary(Game game) {
        gameRepository.delete(game);
    }
}
