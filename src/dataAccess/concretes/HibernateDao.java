package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Kiþi eklendi : Hibernate");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kiþi güncellendi : Hibernate");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kiþi silindi : Hibernate");
		
	}

	@Override
	public User get(int id) {
		System.out.println("Kiþi getirildi. : Hibernate");
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
