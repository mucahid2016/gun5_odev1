package gun5_odev1.business.abstracts;

public interface GoogleService {
	boolean isMailValid(String eMail);
	boolean isPasswordValid(String password);
	boolean isMailUsedBefore(String eMail);

}
