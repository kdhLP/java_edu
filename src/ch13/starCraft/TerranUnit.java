package ch13.starCraft;

/*
 *  게임 속 유닛을 코드로 만들어보기
 *  
 *  TerranUnit > 유닛들의 부모 클래스
 *  	- Q2. Marine / Medic / FireBat 자식 클래스를 구현
 *  
 *  Q3. 유닛들이 타고 이동할 수 있는 Shuttle 클래스를 만드세요
 *  	- 제네릭 타입을 사용
 *  	- Shuttle에 탑승 할 수 있는 객체는 TerranUnit만 가능
 *  	- ** Shuttle에 탑승할 수 있는 유닛의 수는 총 8개 입니다.
 *  	- showInfo() 메소드를 통해서 탑승한 유닛의 정보를 출력
 *  
 */
// Object 클래스는 모든 클래스의 최상위 부모 클래스
// 묵시적 상속 : 보통의 클래스는 extends Object 키워드 생략
public class TerranUnit {
	private String name;
	private int hp;
	
	// 생성자
	public TerranUnit(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	// Q1. 필드의 정보를 가져오는 getter
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	
	// Object 클래스에서 toString() 메소드를 상속받아 재정의
	@Override
	public String toString() {
		return "유닛 정보 ( 이름 : " + this.name
				+ ", hp : " + this.hp+ " ) ";
	}
	
	
}
