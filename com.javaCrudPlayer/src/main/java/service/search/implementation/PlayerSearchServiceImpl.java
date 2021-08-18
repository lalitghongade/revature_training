package service.search.implementation;

import java.util.List;

import dao.PlayerSearchDAO;
import dao.implementation.PlayerSearchDAOImpl;
import exception.BusinessException;
import model.Player;
import service.search.PlayerSearchService;

public class PlayerSearchServiceImpl implements PlayerSearchService{
    PlayerSearchDAO playerSearchDAO = new PlayerSearchDAOImpl();

	@Override
	public Player searchById(int id) throws BusinessException {
		 Player player = null;

	        if (id < 100 || id > 1000)  {
	            throw new BusinessException("Enter a valid ID to search a Player.");
	        } else {
	            player =playerSearchDAO.searchById(id);
	        }
	        return player;
	}

	@Override
	public Player searchByContact(long contact) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> searchByName(String name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> searchByAge(int age) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> searchByGender(String gender) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> searchByCity(String city) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> searchBySportsName(String sportsName) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> searchByTeamName(String teamName) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
