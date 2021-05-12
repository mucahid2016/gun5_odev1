package gun5_odev1.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import gun5_odev1.business.abstracts.GoogleService;
import gun5_odev1.dataAccess.abstracts.UserDao;
import gun5_odev1.entities.concretes.User;

public class GoogleManager implements GoogleService {
	private UserDao userDao;

	public GoogleManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	public GoogleManager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isMailValid(String eMail) {
		String regex="^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(eMail);
		return matcher.find();
	}

	@Override
	public boolean isPasswordValid(String password) {
		for(String pass: userDao.getAllPasswords()) {
			if(pass == password) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isMailUsedBefore(String eMail) {
		for(String mail: userDao.getAllEmails()) {
			if(mail == eMail) {
				return true;
			}
		
	}
		return false;

}
}