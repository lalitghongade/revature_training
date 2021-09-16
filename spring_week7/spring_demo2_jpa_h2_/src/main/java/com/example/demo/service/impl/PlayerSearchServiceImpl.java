package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Player;
import com.example.demo.repository.PlayerRepository;
import com.example.demo.service.PlayerSearchService;

@Service
public class PlayerSearchServiceImpl implements PlayerSearchService{
	
	@Autowired
	private PlayerRepository repository;
	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Player> getPlayersByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByName(name);
	}

	@Override
	public List<Player> getPlayersByAge(int age) {
		// TODO Auto-generated method stub
		return repository.findByAge(age);
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamName) {
		// TODO Auto-generated method stub
		return repository.findByTeamName(teamName);
	}

	@Override
	public List<Player> getPlayersByCity(String city) {
		// TODO Auto-generated method stub
		return repository.findByCity(city);
	}
}
