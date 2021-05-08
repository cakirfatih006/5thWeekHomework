package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class MemoryDao implements UserDao{

	List <User> users;
	
	public MemoryDao() {
		this.users = new ArrayList<User>();
		this.users.add(new User(1,"fatih","cakir","fatih@gmail.com","111"));
		this.users.add(new User(2,"nihat","can","merhmet@gmail.com","222"));
		this.users.add(new User(3,"ozgur","atbin","ozgur@gmail.com","333"));
		
		
		
		
		
	}

	@Override
	public void add(User user) {
		this.users.add(user);
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.users;
	}

}
