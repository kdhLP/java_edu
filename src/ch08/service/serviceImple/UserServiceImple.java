package ch08.service.serviceImple;

import ch08.service.*;

public class UserServiceImple extends User implements UserService, AdminService{
	
	// ������
	public UserServiceImple() {
		printName();
	}
	
	
	@Override
	public void login(String id, String password) {
		
		// �����ͺ��̽��� ���ؼ� �����͸� ������ �Դٶ�� ����
		/*
		 * DAO(Data Access Object) / DTO(Data Transfer Object) VO (Value Object)
		 * 
		 * select * from member where id = ? and password = ?
		 * put(0, id);			// �Ű����� id
		 * put(1, password);	// �Ű����� password
		 * 
		 * -> result : 1 :: �α��� ����
		 * -> result : 0 :: �α��� ���� - '��� : ����� �� ���̵�, �н����带 �Է����ּ���'
		 */
		// member table�� ����� ������ ���� ��ȸ (DTO Ŭ������ �����Ͱ� ����)
		String[][] rows = {
				{"10","user001","1234","860915", "M"},
				{"11","user002","1234","990109", "M"},
				{"12","user003","1234","031215", "F"}
		};
		boolean flag_login = false;
		for (String[] row : rows) {
			if (row[1].equals(id) && row[2].equals(password)) {
				flag_login = true;
				break;
			}
		}
		if(flag_login) {
			// ... �α��� ó�� : session / �α����� �����Ǿ��ٴ� ���� return :: cookie
		}
		
	}

	@Override
	public void logout() {
		
	}

	@Override
	public String findId() {
		return null;
	}

	@Override
	public String findPassword() {
		return null;
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		
	}

}
