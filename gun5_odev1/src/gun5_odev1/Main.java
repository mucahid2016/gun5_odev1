package gun5_odev1;

import gun5_odev1.business.abstracts.UserService;
import gun5_odev1.business.concretes.GoogleManager;
import gun5_odev1.business.concretes.UserManager;
import gun5_odev1.dataAccess.concretes.HibernateUserDao;
import gun5_odev1.dataAccess.concretes.TestUserDao;
import gun5_odev1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "mücahid", "Ekmekçi", "mucahid@gmail.com", "12345");
		UserService userService = new UserManager(new HibernateUserDao(), new GoogleManager(), new TestUserDao());

		
		userService.signUp(user1);
		userService.logIn(user1.geteMail(), user1.getPassword());
		
		
	}

}
