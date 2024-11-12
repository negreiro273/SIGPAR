package com.SIGPAR.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SIGPAR.demo.dto.GameListDTO;
import com.SIGPAR.demo.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	
	@Autowired
	private GameListService gameLisService;

	
	@GetMapping
	public List<GameListDTO> findAll(){
		
		return gameLisService.findAll();	
		
	}
	
	
	
}
