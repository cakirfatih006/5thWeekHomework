import business.concretes.UserManager;
import core.GoogleAuthAdaptor;
import dataAccess.concretes.MemoryDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		

		User user = new User(5,"canturk","karatas","nihat@gmail.com","666");
		
		UserManager userManager= new UserManager(new MemoryDao(), new GoogleAuthAdaptor());
		
		userManager.register(user);
		
		System.out.println("Kayýtlý üyeler:");
		for (User kisi : userManager.getAll()) {
			System.out.println(kisi.getFirstName());
		}
		
		userManager.logIn(user);

	}

}
