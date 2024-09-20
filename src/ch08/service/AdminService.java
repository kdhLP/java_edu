package ch08.service;

public interface AdminService {
	
	void login();
	void logout();
	
	String findId();
	String findPassword();
	
	void updateUser();
}
