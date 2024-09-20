package ch06;

import ch06.access.a.AccessData;

// 접근제어자
/* 
 * 객체지향언어에서 '캡슐화(Encapsulation)' 개념과 관연된 내용
 * 		- 생성된 객체 외부에서 내부 데이터의 접근을 통제
 * 		- 은닉화(정보 은닉)
 * 
 * 접근제어자 종류
 * 		1. public : 모든 외부의 호출(사용)을 허용
 * 		2. protected : 같은 패키지 안에서 호출은 허용 / 다른 패키지의 클래스 등의 호출은 허용.
 * 		2-1. default(기본값) : 같은 패키지 안에서 호출은 허용 / 다른 패키지의 클래스 등의 호출은 허용하지 않음.
 * 		3. private : 모든 외부 호출을 금지
 * 			ex) 사람의 키 - 음식(영양소), 환경등의 영향을 받지만 직접적으로 제어할 수 없는 성질.
 * 
 */
public class Exam06 {
	
	public static void main(String[] args) {
		// 기본 생성자를 통해서 객체를 만들면
		// mainSpeaker.power - on / mainSpeaker.volumn - 5
		// 객체는 Speaker - public : 모든 접근을 허용
		Speaker mainSpeaker = new Speaker();
		// *****************************************************************
		// 		1. 외부에서 직접 맴버변수의 값을 변경하지 못하도록 합니다. : 31
		//			- 맴버 변수에는  private 사용 
		// 		2. 외부에서 private 데이터에 접근하거나(값을 알려고 할 때) 변경(수정)할 때, 
		//			method(getter, setter )를 통해서 데이터를 변경하도록 합니다.
		//			- method에는 public 접근제어자를 사용
		//		ex. 나의 몸무게 : 값은 private / method(행동/기능)을 통해서 조회, 수정 
		// *****************************************************************
		// Speaker.volumn 맴버 변수는 public : 모든 접근을 허용
		// 		protected : 같은 패키지 허용
		//mainSpeaker.volumn = 100;
		// 볼륨을 조절하는 메소드 호출(실행)
		//mainSpeaker.voulumnDown();
		/*
		if ( mainSpeaker.power.equals("on")) {
			System.out.println(mainSpeaker.getVolumn());
		}else {
			System.out.println("스피커가 꺼져있습니다.");
		}
		*/
		//int mainSpeakerVolumn = mainSpeaker.getVolumn();
		//mainSpeaker.showVolumn();
		//mainSpeaker.volumnUp();
		
		/*
		// 접근제어자
		mainSpeaker.power = "켜져라"; // 킴, 켬, 켜져라, 불좀 켜줘, turn on, system on, boot ...
		if(!mainSpeaker.power.equals("on")
				&& !mainSpeaker.power.equals("off")) {
			// on, off 가 아닐경우 예외처리
			System.out.println("올바른 명령어가 아닙니다. (on / off 를 사용해주세요.)");
			mainSpeaker.power = "off";
		}else {
			// on || off 인 경우
		}
		 */
		
		//
		/*
		MiniSpeaker ms = new MiniSpeaker();
		// getter method
		System.out.println("미니스피커의 상태 : " + ms.isPower());
		// setter method
		// 미니스피커 : on
		ms.setPower(true);
		// getter method
		System.out.println("미니스피커의 상태 : " + ms.isPower());
		
		// 스피커의 볼륨을 9까지 올렸다가
		// 스피커의 볼륨을 0으로 만들어보세요. (메소드를 통해서)
		// 메소드를 통해서 볼륨을 제어하고, 제어할 때 마다 해당 volumn 값을 출력하세요.
		*/
		
		/*
		Speaker QSpeaker = new Speaker(9);
		QSpeaker.powerOn();
		QSpeaker.showVolumn();
		for(int i = 0 ; i < 10 ; i++) {
		QSpeaker.voulumnDown();
		}
		QSpeaker.showVolumn();
		*/
		
		// ** 다양한 상황에 따라 접근 제어자 확인
		// 아래의 예시부터는 패키지 위치(경로)가 매우즁요
		// 1. ch06.access.a.AccessData Class 는 public으로 선언 
		//		-> ch.06.Exam06 Class에서 호출 가능
		AccessData innerAccess = new AccessData();
		// 내부 호출(사용) 확인을 위한 메소드 호출
		innerAccess.innerAcces();
	}
}
