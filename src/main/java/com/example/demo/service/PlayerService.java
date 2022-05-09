package com.example.demo.service;

import com.example.demo.controller.CutomException;
import com.example.demo.entities.Player;
import com.example.demo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
	
	@Autowired
	PlayerRepository playerRepository;

	public String home() {
		return "PONG";
	}

	public List<Player> getAllPlayers(){

			return playerRepository.findAll();
	}
	
	public Player getPlayerById(String id){
		Optional<Player> findById = playerRepository.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}else {
			throw new CutomException(id+": Not Found");
		}
	}

	public Player addPlayer(Player player) {
		return playerRepository.save(player);

	}

	public List<Player> addPlayers(@RequestBody List<Player> player) {
		return playerRepository.saveAll(player);
	}
}	
