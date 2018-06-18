package org.eclipse.che.examples.dao;

import org.eclipse.che.springer.dto.User;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;


public class UserImpl {
    
    
    
    private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(User user) {
		int id = user.getId();
		String fname = user.getFirstname();
		String email = user.getEmail();
		int rows = jdbcTemplate.update("insert into User values(?,?,?)", id,fname, email);

		return rows;
	}

	@Override
	public int deleteUser(int userId) {
		String query = "DELETE from User where id=?";
		return jdbcTemplate.update(query, new Object[] { Integer.valueOf(userId) });

	}

	@Override
	public void updateUser(User User) {
		String qs = "UPDATE User SET password=?,email=? WHERE id=?";
		jdbcTemplate.update(qs,
				new Object[] { 
						user.getPassword(),user.getEmail(), Integer.valueOf(user.getId()) 
						});

	}

	@Override
	public User selectUser(int userId) {
		final User user = new User();
		String qs = "SELECT id, firstname, email FROM User WHERE id='" + userId+"'";
		return (User) jdbcTemplate.query(qs, new ResultSetExtractor<User>() {
			public User extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					user.setId(rs.getInt(1));
					user.setFirstname(rs.getString(2));
					user.setEmail(rs.getString(3));
				}
				return user;
			}
		});
	}

}


