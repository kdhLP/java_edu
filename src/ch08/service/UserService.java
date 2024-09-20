package ch08.service;

public interface UserService {
	
	void login(String id, String password);
	void logout();
	String findId();
	String findPassword();
	
}
