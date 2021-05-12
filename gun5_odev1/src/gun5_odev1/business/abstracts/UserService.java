package gun5_odev1.business.abstracts;



import java.util.List;

import gun5_odev1.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void delete(User user);
	void update(User user);
	void logIn(String eMail, String password );
	User getUser(int id);
	List<User> getUserAll();

}
