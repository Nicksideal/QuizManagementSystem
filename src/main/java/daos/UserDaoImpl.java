package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.User;
import utility.ConnectionsUtil;
import utility.MagicWords;

public class UserDaoImpl implements UserDao{
	private static UserDao instance = new UserDaoImpl();

	private User extractUser(ResultSet rs) throws SQLException {
		return new User(rs.getInt("user_id"), rs.getString("username"), null, null, null, 0);
		
	}
	
	@Override
	public User login(String username, String password) {
		try (Connection c = ConnectionsUtil.getConnection()){
			PreparedStatement stmt = c.prepareCall(MagicWords.LOGIN_QUERY);
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return extractUser(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static UserDao getInstance() {
		return instance;
	}
	

}
