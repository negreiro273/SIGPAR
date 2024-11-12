package com.SIGPAR.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SIGPAR.demo.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
	
	

}
