package gun5_odev1.dataAccess.abstracts;



import java.util.List;

import gun5_odev1.entities.concretes.User;

public interface UserDao {
	void register(User user);
	void login(User user);
	 User get (int id);
	List<User> getAll();
	List<String> getAllPasswords();
	List<String> getAllEmails();

}
