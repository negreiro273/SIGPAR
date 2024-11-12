package com.SIGPAR.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SIGPAR.demo.dto.GameDTO;
import com.SIGPAR.demo.dto.GameMinDTO;
import com.SIGPAR.demo.entities.Game;
import com.SIGPAR.demo.projections.GameMinProjection;
import com.SIGPAR.demo.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
	
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		
	    var result = gameRepository.findAll();		
	    return  result.stream().map(x -> new GameMinDTO(x)).toList();

		
	}

	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listid){
		
		List<GameMinProjection>  result = gameRepository.searchByList(listid);		
	    return  result.stream().map(x -> new GameMinDTO(x)).toList();

		
	}	
	
	
}
