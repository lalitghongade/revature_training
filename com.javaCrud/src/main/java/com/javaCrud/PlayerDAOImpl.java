package com.javaCrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.BussinesException.BusinessException;
import com.javaCrud.model.Player;

public class PlayerDAOImpl implements PlayerDAO {

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		// TODO Auto-generated method stub

		List<Player> playerList=new ArrayList<>();
		
		//step 2 connecting to db
		try(Connection connection=MySqlDbConnection.getConnection()){
			//step 3 Create statement
			//creating sql query and storing it into string sql
			String sql="select id,name,age,gender,city,sportsName,contact from player order by name ";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			//step 4 Execute the query
			
			ResultSet resultSet=preparedStatement.executeQuery(sql);  
			  
			while(resultSet.next()){  
				Player player=new Player(); 
				
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setSportsName(resultSet.getString("sportsName"));
				playerList.add(player);
			}  
			
			//Since Java 7, JDBC has ability to use try-with-resources statement to automatically close resources of type Connection, ResultSet, and Statement.
			} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new BusinessException("internal server error try contacting admin");
		}
		
		
		return playerList;
	}

	@Override
	public int createPlayer(Player player) throws BusinessException {
		int c = 0;
        try(Connection connection = MySqlDbConnection.getConnection()) {
            String sql = "INSERT INTO player (id, name, age, gender, sportsName, city, contact) values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, player.getId());
            preparedStatement.setString(2, player.getName());
            preparedStatement.setInt(3, player.getAge());
            preparedStatement.setString(4, player.getGender());
            preparedStatement.setString(5, player.getSportsName());
            preparedStatement.setString(6, player.getCity());
            preparedStatement.setLong(7, player.getContact());

            c = preparedStatement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            throw new BusinessException("Internal error occurred, please contact support");
        }
        return c;
	}

	@Override
	public int updatePlayer(int id, long contact) throws BusinessException {
		int c = 0;
        try (Connection connection = MySqlDbConnection.getConnection()){
            String sql = "UPDATE player SET contact = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, contact);
            preparedStatement.setInt(2, id);
            c = preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            throw new BusinessException("Internal error occurred, please contact support");
        }
        return c;
	}

	@Override
	public int deletePlayer(int id) throws BusinessException {
		 int c = 0;
	        try(Connection connection = MySqlDbConnection.getConnection()){
	            String sql = "DELETE FROM player WHERE id = ?";
	            PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setInt(1, id);
	            c = preparedStatement.executeUpdate();
	            
	        } catch (ClassNotFoundException | SQLException e) {
	            throw new BusinessException("Internal error occurred, please contact support");
	        }
	        return c;
	}

}
