package com.live.myarchive.Service;



import com.live.myarchive.Games.Game;

import java.util.List;

public interface IGamesService {
    List<Game> getMyGames();

    void addGameToLibrary(Game game);

    void deletGameFromLibrary(Game game);
}
