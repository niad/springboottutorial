package kr.pe.ned.service;

import java.util.List;

import kr.pe.ned.model.User;

public interface UserService {

	Long insert(User user);
	
	void update(User user);
	
	void delete(Long id);
	
	User select(Long id);
	
	List<User> selectList();	
	
}
