package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Player;
import com.example.demo.service.PlayerCRUDService;

@RestController
public class PlayerCRUDController {

	@Autowired
	private PlayerCRUDService service;
	
	@PostMapping("/player")
	public Player addPlayer(@RequestBody Player player) {
		System.out.println("this is from add player "+player);
		return service.addPlayer(player);
	}

	@PutMapping("/player")
	public Player updatePlayer(@RequestBody Player player) {
		// TODO Auto-generated method stub
		System.out.println("this is from update method "+player);
		return service.updatePlayer(player);
	}

	@GetMapping("/player/{id}")
	public Player getPlayerById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return service.getPlayerById(id);
	}

	@DeleteMapping("/player/{id}")
	public void deletePlayer(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.deletePlayer(id);
	
}
}
