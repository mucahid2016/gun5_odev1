package gun5_odev1.dataAccess.concretes;

import java.util.List;

import gun5_odev1.dataAccess.abstracts.UserDao;
import gun5_odev1.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void register(User user) {
		System.out.println( user.getName() +" : Kullanýcýsý kayýt oldu");
		
	}

	@Override
	public void login(User user) {
		System.out.println( user.getName() +" : Kullanýcýsý giriþ yaptý");
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllPasswords() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllEmails() {
		// TODO Auto-generated method stub
		return null;
	}

}
