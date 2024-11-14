package com.SIGPAR.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SIGPAR.demo.dto.GameListDTO;
import com.SIGPAR.demo.projections.GameMinProjection;
import com.SIGPAR.demo.repositories.GameListRepository;
import com.SIGPAR.demo.repositories.GameRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameLisRepository;
	@Autowired
	private GameRepository gameRepository; 
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){		
	    var result = gameLisRepository.findAll();		
	    return  result.stream().map(x -> new GameListDTO(x)).toList();		
	}

	
	@Transactional
	public void move(long listid, int soucerIndex, int destinationIndex) {
		
		List<GameMinProjection> list = gameRepository.searchByList(listid);
		
		GameMinProjection obj = list.remove(soucerIndex);
		
		list.add(destinationIndex,obj);
		
		int min = soucerIndex < destinationIndex ? soucerIndex      : destinationIndex;
		int max = soucerIndex < destinationIndex ? destinationIndex : soucerIndex ;
		
		for (int i = min; i <= max; i++) {
			gameLisRepository.updateBelongingPosition(listid,list.get(i).getId(), i);
			
			
		}
		
		
		
		
	}
	
	
	
}
