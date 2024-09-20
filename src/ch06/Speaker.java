package ch06;

public class Speaker {
	
	// on / off
	private String power;
	// 0 ~ 10���� ũ�⸦ ���� �� �ֵ��� �մϴ�.
	private int volumn;
	
	// ex. '������' ��Ű���� �����ִ� ���, 
	protected String log;
	
	// �⺻ ������
	public Speaker() {
		this.power = "on";
		this.volumn = 5;
	}
	
	// ������
	public Speaker(int setVolumn) {
		// �⺻ �����ڸ� ����
		this();
		// �Ķ���ͷ� �Ѱܹ��� setVolumn(�Ҹ��� ũ��)�� Ȯ���ϰ� ����
		if (setVolumn >= 10) setVolumn = 10;
		if (setVolumn <= 0) setVolumn = 0;
		this.volumn = setVolumn;
	}
	// ���� ����(���� ��Ű��) ������ ����� ������ ������(Ư���� �޼ҵ�)
	protected Speaker( String setPower ) {
		
	}
	
	// �Ҹ��� Ű��� �޼ҵ�
	// this.volumn ������ ���� 1�� ������Ų��.
	// �ɹ� ������ ���� �����Ѵ� : setter method (�Լ�)
	// set + {�ɹ� ���� �̸�}()
	public void setVolumn() { }
	// �ɹ� ������ ���� �����´�(get) : getter �޼ҵ�(�Լ�)
	public int getVolumn() {
		return volumn; }
	
	public void volumnUp() {
		if (this.volumn < 10) {
			this.volumn++;
		}
	}
	public void voulumnDown() {
		this.volumn--;
		if (this.volumn < 0) this.volumn = 0;
	}
	
	 public void powerOn() {
		 if ( this.power.equals("off") ) {
			 this.power = "on";
		 }
	 }
	 public void powerOff() {
		 this.power = "off";
	 }
	 
	 // Ȯ�ο�
	 public void showVolumn() {
		 if (this.power.equals("on") ) {
			 System.out.println("���� �Ҹ��� ũ��� " + this.volumn + "�Դϴ�.");
		 }else {
			 System.out.println(" ����Ŀ�� ������ �����ֽ��ϴ�. ");
		 }
		 
	 }
	
}
