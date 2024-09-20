package ch06;

public class Speaker {
	
	// on / off
	private String power;
	// 0 ~ 10까지 크기를 받을 수 있도록 합니다.
	private int volumn;
	
	// ex. '관리자' 패키지로 묶여있는 경우, 
	protected String log;
	
	// 기본 생성자
	public Speaker() {
		this.power = "on";
		this.volumn = 5;
	}
	
	// 생성자
	public Speaker(int setVolumn) {
		// 기본 생성자를 실행
		this();
		// 파라미터로 넘겨받은 setVolumn(소리의 크기)를 확인하고 대입
		if (setVolumn >= 10) setVolumn = 10;
		if (setVolumn <= 0) setVolumn = 0;
		this.volumn = setVolumn;
	}
	// 허용된 범위(같은 패키지) 내에서 사용이 가능한 생성자(특별한 메소드)
	protected Speaker( String setPower ) {
		
	}
	
	// 소리를 키우는 메소드
	// this.volumn 변수의 값을 1씩 증가시킨다.
	// 맴버 변수의 값을 세팅한다 : setter method (함수)
	// set + {맴버 변수 이름}()
	public void setVolumn() { }
	// 맴버 변수의 값을 가져온다(get) : getter 메소드(함수)
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
	 
	 // 확인용
	 public void showVolumn() {
		 if (this.power.equals("on") ) {
			 System.out.println("현재 소리의 크기는 " + this.volumn + "입니다.");
		 }else {
			 System.out.println(" 스피커의 전원이 꺼져있습니다. ");
		 }
		 
	 }
	
}
