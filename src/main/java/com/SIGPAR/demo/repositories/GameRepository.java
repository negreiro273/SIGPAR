package com.SIGPAR.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SIGPAR.demo.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	
	

}
