package dao;

import java.util.List;

import exception.BusinessException;
import model.Player;

public interface PlayerSearchDAO {
	
		public Player searchById(int i) throws BusinessException;
	    public Player searchByContact(long contact) throws BusinessException;
	    public List<Player> searchByName(String name) throws BusinessException;
	    public List<Player> searchByAge(int age) throws BusinessException;
	    public List<Player> searchByGender(String gender) throws BusinessException;
	    public List<Player> searchByCity(String city) throws BusinessException;
	    public List<Player> searchBySportsName(String sportsName) throws BusinessException;
	    public List<Player>  searchByTeamName(String teamName)  throws  BusinessException;
	

}