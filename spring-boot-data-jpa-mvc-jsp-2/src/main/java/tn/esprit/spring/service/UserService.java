package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.User;

public interface UserService  {
	List<User> retrieveAllUsers();
	User addUser(User u);
	void deleteUser(Long id);
	User updateUser(User u);
	User retrieveUser(Long id);
	public String getUserNameById(int Id);

}
