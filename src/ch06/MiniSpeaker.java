package ch06;

public class MiniSpeaker {
	// Ŭ������ �����͸� ������ �ִ� ��� ���� :: private
	private boolean power;
	private int volumn;
	
	// ������: �ɹ� ������ �ʱ�ȭ
	public MiniSpeaker() {
		this.power = false;
		this.volumn = 5;
	}
	
	// getter / setter �޼ҵ�(�Լ�)
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
