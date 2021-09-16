package dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.Player;

public class PlayerRowMapper implements RowMapper<Player> {

	@Override
	public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
		Player player=new Player();
		player.setId(rs.getInt("id"));
		player.setAge(rs.getInt("age"));
		player.setName(rs.getString("name"));
		player.setCity(rs.getString("city"));
		player.setContact(rs.getLong("contact"));
		player.setGender(rs.getString("gender"));
		player.setTeamId(rs.getInt("teamId"));
		player.setSportsName(rs.getString("sportsName"));
		return player;
	}
}
