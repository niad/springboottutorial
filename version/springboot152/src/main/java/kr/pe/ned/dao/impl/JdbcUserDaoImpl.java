package kr.pe.ned.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import kr.pe.ned.dao.UserDao;
import kr.pe.ned.model.User;

//@Repository
public class JdbcUserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public Long insert(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User select(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectList() {
		String query = "SELECT id, name, email FROM CM_USERS";
		List<User> results = jdbcTemplate.query(query, new BeanPropertyRowMapper<User>(User.class));
		return results;
	}

}
