package business.concretes;

import java.util.List;
import java.util.regex.*;

import business.abstracts.UserService;
import core.AuthService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private AuthService authService;
	
public UserManager(UserDao userDao,AuthService authService) {
		
		this.userDao = userDao;
		this.authService = authService;
	}


	public boolean CheckIfPasswordValid(String password) {
		
		if(password.length()<=6)return false;
		else {return true;}
		
		
	}
	
	
	public boolean CheckIfEpostaValid(String eMail) {
		
		Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
		Matcher matcher = pattern.matcher(eMail);
		return matcher.matches();
		
	}
	
	
	public boolean CheckIfEmailExists(String eMail) {
		List<User> users = userDao.getAll();
		
		int i = 0;
		for (User user : users) {			
			if(user.getePosta() == eMail) {
				
				i= 1;
			}
		}
		if(i==1)return true;
		else return false;		

	}
	
	public boolean CheckIfNameLengthValid(String firstName,String lastName) {
		if(firstName.length() >=2 && lastName.length() >= 2){
			return true;
		}
		return false;
	}
	
	
	@Override
	public void register(User user) {
		
		if(!CheckIfEmailExists(user.getePosta()) && CheckIfEpostaValid(user.getePosta()) && 
				CheckIfNameLengthValid(user.getFirstName(), user.getLastName()) && CheckIfPasswordValid(user.getPassword())) {
			
			authService.register(user);
			userDao.add(user);
			
		}
		else {
			System.out.println("Kayýt olma baþarýsýz!");		}
	}
	@Override
	public void logIn(User user) {

		authService.logIn(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public List<User> getAll() {
		
		
		return userDao.getAll();
	}

}
