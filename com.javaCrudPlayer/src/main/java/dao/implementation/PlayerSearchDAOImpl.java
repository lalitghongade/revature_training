package dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import connection.MySqlDbConnection;
import dao.PlayerSearchDAO;
import exception.BusinessException;
import model.Player;
import model.Team;

public class PlayerSearchDAOImpl implements PlayerSearchDAO{
	
	private static final Logger log = Logger.getLogger(PlayerSearchDAOImpl.class);


	@Override
	public Player searchById(int id) throws BusinessException {
		Player player = null;
        try (Connection connection = MySqlDbConnection.getConnection()) {

            String sql = "SELECT p.id, name, age, gender, sportsName, city, contact, t.teamName FROM player p JOIN team t ON p.teamId = t.teamId WHERE p.id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                player = new Player();
                player.setId(id);
                player.setName(resultSet.getString("name"));
                player.setGender(resultSet.getString("gender"));
                player.setAge(resultSet.getInt("age"));
                player.setCity(resultSet.getString("city"));
                player.setSportsName(resultSet.getString("sportsName"));
                player.setContact(resultSet.getLong("contact"));
                Team team = new Team();
                team.setTeamName(resultSet.getString("teamName"));
                player.setTeam(team);
            } else {
                throw new BusinessException("We couldn't find any matches for " + id + ".\nDouble check your search for any typos or spelling errors or try a different search term.");
            }
        } catch (SQLException | ClassNotFoundException e) {
            log.error(e);
            throw new BusinessException("Internal error occurred contact ");
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
