package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Player;
import com.example.demo.repository.PlayerRepository;
import com.example.demo.service.PlayerCRUDService;
@Service
public class PlayerCRUDServiceImpl implements PlayerCRUDService {
	
	@Autowired
	private PlayerRepository repository;

	@Override
	public Player addPlayer(Player player) {
		// TODO Auto-generated method stub
		return repository.save(player);
	}

	@Override
	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		return repository.save(player);
	}

	@Override
	public Player getPlayerById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void deletePlayer(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
}
