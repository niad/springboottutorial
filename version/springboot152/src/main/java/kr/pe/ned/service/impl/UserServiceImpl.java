package kr.pe.ned.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.pe.ned.dao.UserDao;
import kr.pe.ned.model.User;
import kr.pe.ned.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	@Autowired
	private UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
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
		return userDao.selectList();
	}

}
