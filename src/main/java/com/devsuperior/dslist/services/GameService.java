package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMiniDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

//registrar como componete do sistema
//

@Service
public class GameService {
	
	@Autowired //  INJETANDO instancia do repository em GAMESERVICE 
	private GameRepository gameRepository;
	//	public List<GameMiniDTO> findAll(){   ORIGINAL
	
	public List<GameMiniDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMiniDTO> dto = result.stream().map(x -> new GameMiniDTO(x)).toList();
		// hora 1:49 da video aula
		return dto; // este metodo RETORNA A LISTA DE GAMES
		
		//tbm pode ser escrever desta forma 
		//return result.stream().map(x -> new GameMiniDTO(x)).toList();
	}
}
