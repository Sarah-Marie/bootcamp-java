package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.User;

public class UserDB implements DAO<User> {
	
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs";
		String username = "prs_user";
		String password = "sesame";
		Connection conn = DriverManager.getConnection(dbURL, username, password);
		return conn;
	}

	@Override
	public User get(int id) {
		String sql = "SELECT UserName, Password, FirstName, LastName, PhoneNumber, Email, IsReviewer, IsAdmin"
				+ "From User"
				+ "Where ID = ?";
		try (Connection connection = getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {
			String UserName;
			ps.setString(1, UserName);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String password = rs.getString("Password");
				String firstName;
				String lastName;
				String phoneNumber;
				String email;
				User u = new User (UserName, password, firstName, lastName, phoneNumber, email, IsReviewer, IsAdmin, );
				rs.close();
				return u;
			} else {
				rs.close();
				return null;
			}
		} catch (SQLException e) {
			System.err.println(e);
			return null;
		}
				
		
		
	}

	@Override
	public List<User> list() {
		String sql = "SELECT * from User";
		List<User> users = new ArrayList<>();
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
						ResultSet rs = ps.executeQuery()) {
			// while there is a row in the rs
			while (rs.next()) {
				int id = rs.getInt(1);
				String un = rs.getString(2);
				String pw = rs.getString(3);
				String fn = rs.getString(4);
				String ln = rs.getString(5);
				String pn = rs.getString(6);
				String e = rs.getString(7);
				boolean r = rs.getBoolean(8);
				boolean a = rs.getBoolean(9);
				User u = new User(id, un, pw, fn, ln, pn, e, r, a);
				users.add(u);
				
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			users = null;
		}
		return users;
	}

	@Override
	public boolean add(User u) {
		boolean success = false;
		String sql = "INSERT into User (UserName, Password, FirstName, LastName, PhoneNumber, " + 
				"Email, IsReviewer, IsAdmin)" +
				"values (?, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1,  u.getUserName());
			ps.setString(2,  u.getPassword());
			ps.setString(3,  u.getFirstName());
			ps.setString(4,  u.getLastName());
			ps.setString(5,  u.getPhoneNumber());
			ps.setString(6,  u.getEmail());
			ps.setBoolean(7,  u.isReviewer());
			ps.setBoolean(8,  u.isAdmin());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean update(User u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User u) {
		String sql = "DELETE FROM Users"
				   + "WHERE UserName = ?";
		try (Connection connection = getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setString(1,  u.getUserName());
			ps.executeUpdate();
			return true;
			
		} catch (SQLException e) {
			System.err.println(e);
			return false;
		}
		
	}

}
