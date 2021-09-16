package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Player;


@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{
	
	List<Player> findByName(String name);
	List<Player> findByAge(int age);
	List<Player> findByTeamName(String teamName);
	List<Player> findByCity(String city);
}
