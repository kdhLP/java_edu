package ch12;

/*
 * Thread를 만드는 법
 * 	 1. Thread 클래스를 상속(extend)
 * 	 2. Runnable 인터페이스를 구현(implement)
 * 
 * ** 실무에서 Thread 활용여부
 * 	 - 분야별로 개발자가 Thread에 관여하는 정도가 다름
 * 	 - 웹, 앱 개발자는 직접 구현하는 Thread는 거의 없음 (Framework에 일임)
 * 	 - 게임, 영상 분야 개발자는 필수적으로 Thread를 직접 구현
 * 	 - 예) 파일 다운로드 
 * 		a) 파일을 다운로드, 사용자에게 얼마나 진행되었는지 알려주는 내용
 * 			(마스킹, 로딩 프로그레스바...)
 * 		b) 대용량 파일을 읽을 때, 여러개의 스레드를 이용해서 섹터별로 데이터를 사용
 * 
 */

import static util.CommonUtil.*;

public class Exam01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. main() : main Thread 실행
		 * 	 - 프로세스가 제대로 작동하기 위해서 1개 이상의 스레드가 존재( main() )
		 * 2. Thread를 상속받은 클래스의 객체를 생성
		 * 3. ex.start() 메소드를 싱행
		 * 	 - Memory > Stack > 또다른 작업단위를 실행하기 위해서 영역 할당
		 * 	 - 새로운 스레드에 이름을 부여하지 않으면, Thread-0, Thread-1... 처럼 임의 이름을 부여
		 * 4. run() 메소드 실행
		 * 	 - 스레드의 실행순서는 보장되지 않음
		 * 	 - 스레드는 동시에 실행되기 때문에 스레드 간의 실행순서는 얼마든지 달라질 수 있음
		 * 	 - 하나 이상의 스레드가 만들어졌기 때문에 : Multi-Thread(다중 스레드)
		 * 5. main() : main Thread 종료
		 */
		
		// 'main'이라는 이름의 Thread가 실행
		//System.out.println(Thread.currentThread().getName()+ " : 1. main() start");
		log(" : 1. main() start ");
		
		// Thread를 상속받은 클래스의 객체 생성
		Exam01Thread ex = new Exam01Thread();
		
		// run() 메소드가 실행되는 위치를 확인하기 위한 출력문
		//System.out.println(Thread.currentThread().getName()+ " : 1. start() 실행 전");
		log(" : 1. start() 실행 전");
		// run() 메소드 재정의 > 호출 x / start() 메소드를 호출 : 다른 Thread가 생성
		ex.start();
		// run() 메소드를 호출 - Thread의 Name : main
		ex.run();
		
		// run() 메소드가 실행되는 위치를 확인하기 위한 출력문
		System.out.println(Thread.currentThread().getName()+ " : 1. start() 실행 후");
		
		// "main" 이라는 이름의 Thread가 종료
		System.out.println(Thread.currentThread().getName()+ " : 1. main() end");
		
		// Runnable 인터페이스 구현 실행
		// - 방법 1과 매우 비슷
		Exam01Runnable exR = new Exam01Runnable();
		// - Thread와 실행할 작업을 구분
		// - Thread의 객체를 생성할 때, 실행할 작업을 생성자로 전달
		Thread th = new Thread(exR);
		// start() : Thread가 생성
		th.start();
		
		/* // Thread 클래스를 상속받아 구현하는 것보다는 
		 * 	 Runnable 클래스를 상속받아 구현하는 것을 추천
		 * 
		 * Thread 클래스 상속
		 * 	 - 장점 	: 간단하게 구현이 가능
		 * 	 - 단점 	: 상속의 제한 :: 자바는 단일 상속만 가능
		 * 				/ Thread를 상속받아야 하는 클래스가 이미 다른 클래스를 상속받았다면
		 * 					Thread 클래스를 상속받을 수 없음 
		 * 		   	: 유연성 부족 :: Runnable 인터페이스를 사용하는 것에 비해 코드 유연성이 떨어짐
		 * 
		 * Runnable 인터페이스를 상속(구현)
		 * 	 - 장점	: 자유로운 상속 :: 자바는 다중 구현은 가능
		 * 					/ 이미 상속받은 클래스도 구현 가능
		 * 		   	: 코드의 분리 :: 스레드와 실행할 작업을 분리해서 코드의 가독성을 높임
		 * 				/ 여러 스레드가 동일한 Runnable 객체의 공유가능
		 * 				/ 한 스레드가 경우에 따라서 여러개의 Runnable 객체의 사용 가능
		 * 	 - 단점	: 코드가 복잡해질 가능성이 높아짐
		 * 
		 */
		
		/*
		 * 스레드의 개수를 기준으로 구분
		 * 	 1. 단일 스레드(Single Thread)
		 * 	 2. 다중 스레드(Multi Thread)
		 * 
		 * 작업의 중요도를 기준으로 구분
		 * 		* 프로그램 - 프로세스
		 * 		* 각각의 문서 - 스레드
		 * 
		 * 	 1. 사용자 스레드(non-daemon Thread)
		 * 		- 프로그렘의 주요작업을 수행
		 * 		- 작업이 완료될 때까지 실행
		 * 
		 * 	 2. 데몬 스레드(daemon Thread)
		 * 		- 백그라운드에서 보조적인 작업을 수행
		 * 		- 모든 사용자 스레드가 종료되면 자동으로 같이 종료
		 * 		- .start() 실행하기 전에 결정 > .start() 실행된 이후에는 변경 X
		 * 
		 * 
		 */		
		
		System.out.println(Thread.currentThread().getName() + " 2. main : Daemon 실행");
		
		Exam01Daemon dm = new Exam01Daemon(); // Runnable 인터페이스 구현
		Thread thDm = new Thread(dm, "Daemon Thread");
		// .setDaemon(boolean false) : 데몬 스레드를 설정하는 메소드
		thDm.setDaemon(true); // 데몬 스레드 사용
		thDm.start();
		
		System.out.println(Thread.currentThread().getName() + " 2. main : Daemon 종료");
		
		
		
		
		
		
	}
}
