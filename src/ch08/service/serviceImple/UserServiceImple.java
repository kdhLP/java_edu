package ch08.service.serviceImple;

import ch08.service.*;

public class UserServiceImple extends User implements UserService, AdminService{
	
	// 생성자
	public UserServiceImple() {
		printName();
	}
	
	
	@Override
	public void login(String id, String password) {
		
		// 데이터베이스를 통해서 데이터를 가지고 왔다라고 가정
		/*
		 * DAO(Data Access Object) / DTO(Data Transfer Object) VO (Value Object)
		 * 
		 * select * from member where id = ? and password = ?
		 * put(0, id);			// 매개변수 id
		 * put(1, password);	// 매개변수 password
		 * 
		 * -> result : 1 :: 로그인 성공
		 * -> result : 0 :: 로그인 실패 - '경고 : 제대로 된 아이디, 패스워드를 입력해주세요'
		 */
		// member table에 사용자 정보를 전부 조회 (DTO 클래스에 데이터가 저장)
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
			// ... 로그인 처리 : session / 로그인이 성공되었다는 값을 return :: cookie
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
