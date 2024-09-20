package ch12;

public class Exam01Daemon implements Runnable {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+ " : Deamon run() start");
		
		// 체크예외를 던질 수 없음 (throws를 사용할 수 없음)
		//	 - Override의 규칙 중 1개
		//		: 부모 메소드가 예외를 던지지 않는 경우,
		//			재정의된 자식 메소드도 예외를 던지지 못함
		try {
			// .sleep(long millis) : 밀리초 (1/1000초)
			// : 현재 스레드를  milli-seconds 만큼 시간-대기상태로 바꿈
			/*
			 * Thread Status(상태값)
			 * 	 1. New				: 생성
			 * 	 2. Runnable		: 실행 가능 상태
			 * 	 3. Terminated		: 종료
			 * 	 4. Block			: 차단 상태 - Lock
			 * 	 5. Waiting			: 대기상태 - 무기한 대기 상태
			 * 	 6. Timed Waiting	: 시간 제한 대기 상태 - 제한된 시간만큼 대기
			 * 
			 */
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+ " : Daemon run() end");
	}
}
