package ch06;

public class MiniSpeaker {
	// 클래스의 데이터를 가지고 있는 멤버 변수 :: private
	private boolean power;
	private int volumn;
	
	// 생성자: 맴버 변수의 초기화
	public MiniSpeaker() {
		this.power = false;
		this.volumn = 5;
	}
	
	// getter / setter 메소드(함수)
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getVolumn() {
		return volumn;
	}
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	
	//
	
}
