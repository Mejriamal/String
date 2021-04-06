package tn.esprit.spring;

import org.junit.Test;
import tn.esprit.spring.service.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import tn.esprit.spring.entity.Role;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.service.UserServiceImpl;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDataJpaMvcJsp2ApplicationTests {
	@Autowired
	UserServiceImpl us;
	
	@Test
	public void retrieveAllUsersTest() throws ParseException {
		us.retrieveAllUsers();
	}
	
	/*
	@Test
	public void addUserTest() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2020-03-23");
		User u = new User( "Amal", "Mejri", Role.TECHNICIEN,new Date());
        us.addUser(u);
	}
	*/

	
	@Test
	public void deleteUserTest() throws ParseException {
		Long l= new Long(3);
		us.deleteUser(l);
	}
	
	@Test
	public void updateUserTest() throws ParseException {
		User u = new User(1, "Chaima", "wahid", Role.TECHNICIEN,new Date());
		us.updateUser(u);
	}
	
		@Test
	public void testttt() throws ParseException {
			int i= 0 ; 
			for (i=0 ; i<100 ; i++)
			{
				us.getUserNameById(i);

			}
		

	}
	/*
	@Test
	public void retrieveUserTest() throws ParseException {
		Long l= new Long(1);
		us.retrieveUser(l);
	}
		
*/
}
