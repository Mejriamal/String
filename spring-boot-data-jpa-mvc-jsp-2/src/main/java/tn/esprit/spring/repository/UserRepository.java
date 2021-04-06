package tn.esprit.spring.repository;


import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.User;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends CrudRepository<User,Long> {
	@Query(value ="select c.FirstName from User c where id =:iduser") 
	String findFirstNameByid(@Param("iduser") int iduser) ;
	
	//@Query
	

	
}








