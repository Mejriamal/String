package tn.esprit.spring.service;

import java.util.ArrayList; 
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.User;
import tn.esprit.spring.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService  {

	@Autowired
    UserRepository userRepository;
	private static final Logger L = LogManager.getLogger(UserServiceImpl.class);

	@Override
	public
	List<User> retrieveAllUsers() {
		List<User> users = (List<User>) userRepository.findAll();
		for (User user : users) {
		L.info("user ++"+ user);
		}
		return users;
	}
	public User addUser(User u) {
		userRepository.save(u);
		L.info("user ajouter"+ u);
		return u;
	}
public void deleteUser(Long id){
	userRepository.deleteById(id);
	L.info("utilisateur supprimer");

}
public User updateUser(User u){
	
	userRepository.save(u);
	L.info("utilisateur bien modifier");

	return u;
}

public	User retrieveUser(Long id) {
	Optional<User> u =  userRepository.findById(id);
	User user = u.get();
	L.info("utilisateur bien trouver = "+user);

	return user;
}

@Override
public String getUserNameById(int id) {
	//Optional<User> U =  UserRepository.findById((long) ID);
	
	String s=	userRepository.findFirstNameByid(id); 	
		return s ;

	
	}
}



