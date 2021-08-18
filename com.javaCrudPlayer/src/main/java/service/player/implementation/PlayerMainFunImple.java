package service.player.implementation;

import java.util.List;

import dao.PlayerDAO;
import dao.implementation.PlayerDAOImpl;
import exception.BusinessException;
import model.Player;
import service.player.PlayerMainFunc;

public class PlayerMainFunImple implements PlayerMainFunc {
	 PlayerDAO playerDAO = new PlayerDAOImpl();
	
	@Override
	public int createPlayer(Player player) throws BusinessException {
		int isSuccesfull = 0;
        isSuccesfull = playerDAO.createPlayer(player);

        return isSuccesfull;	}

	@Override
	public int updatePlayer(int id) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletePlayer(int id) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
