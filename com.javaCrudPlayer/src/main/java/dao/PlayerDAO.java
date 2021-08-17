package dao;

public class PlayerDAO {
	
	 int createPlayer(Player player) throws BusinessException;
	 int updatePlayer(int id) throws BusinessException;
	 int deletePlayer(int id) throws BusinessException;
	 List<Player> getAllPlayers() throws BusinessException;
	

}
