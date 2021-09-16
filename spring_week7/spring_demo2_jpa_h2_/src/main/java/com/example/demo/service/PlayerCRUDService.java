package com.example.demo.service;

import com.example.demo.model.Player;

public interface PlayerCRUDService {

	Player addPlayer(Player player);
	Player updatePlayer(Player player);
	Player getPlayerById(int id);
	void deletePlayer(int id);

}
