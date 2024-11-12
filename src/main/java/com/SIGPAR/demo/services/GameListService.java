package com.SIGPAR.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SIGPAR.demo.dto.GameListDTO;
import com.SIGPAR.demo.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameLisRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){		
	    var result = gameLisRepository.findAll();		
	    return  result.stream().map(x -> new GameListDTO(x)).toList();		
	}

	
	
	
	
}
