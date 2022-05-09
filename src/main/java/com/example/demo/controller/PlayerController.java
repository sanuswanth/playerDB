package com.example.demo.controller;

import com.example.demo.entities.Player;
import com.example.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PlayerController {
	
	@Autowired
	PlayerService playerService;

	@GetMapping("/ping")
	public String home(){
		return "PONG";
	}

	@GetMapping("/api/players")
	public List<Player> getAllPlayers(){
		return playerService.getAllPlayers();
	}
	
	@GetMapping(path = "/api/players/{id}")
	public Player getPlayerById(@PathVariable String id){
		return playerService.getPlayerById(id);
	}
	
	@PostMapping("/api/addPlayer")
	public Player addPlayer(@RequestBody Player player) {
		return playerService.addPlayer(player);
	}

	@PostMapping("/api/addPlayers")
	public List<Player> addPlayers(@RequestBody List<Player> player) {
		return playerService.addPlayers(player);
	}
}
