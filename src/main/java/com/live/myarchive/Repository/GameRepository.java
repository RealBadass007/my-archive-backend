package com.live.myarchive.Repository;


import com.live.myarchive.Games.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
}

