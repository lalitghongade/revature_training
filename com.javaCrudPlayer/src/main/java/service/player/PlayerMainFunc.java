package service.player;

import java.util.List;

import exception.BusinessException;
import model.Player;

public interface PlayerMainFunc {
	int createPlayer(Player player) throws BusinessException;
    int updatePlayer(int id) throws BusinessException;
    int deletePlayer(int id) throws BusinessException;
    List<Player> getAllPlayers() throws BusinessException;
}
