package gun5_odev1.business.concretes;

import java.util.List;

import gun5_odev1.business.abstracts.GoogleService;
import gun5_odev1.business.abstracts.UserService;
import gun5_odev1.dataAccess.abstracts.UserDao;
import gun5_odev1.dataAccess.concretes.TestUserDao;
import gun5_odev1.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private GoogleService googleService;
	private TestUserDao testUserDao;

	public UserManager(UserDao userDao, GoogleService googleService,TestUserDao testUserDao) {
		super();
		this.userDao = userDao;
		
		this.testUserDao = testUserDao;
	}



	@Override
	public void signUp(User user) {
		if(user.getName().length()<2 && user.getLastName().length()<2 && user.getPassword().length()<6) {
			System.out.println("�sim en az 2 harf, soyisim en az 2 harf, parola en az 6 harf olmad�r!");
			return;
		}
		/*if(googleService.isMailUsedBefore(user.geteMail())) {
			System.out.println(user.geteMail() + " L�tfen farkl� 1 mail adresi giriniz bunu daha �nceden kulland�n�z!");
			return;
		}*/
		
		this.userDao.register(user);
		
		
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName()+ ": KUllan�c�s silnidi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName()+ ": KUllan�c�s g�ncellendi");
		
	}

	@Override
	public void logIn(String eMail, String password) {
		System.out.println(": KUllan�c�s giri� yapt�");
		
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
