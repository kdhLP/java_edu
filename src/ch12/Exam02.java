package ch12;

import static util.CommonUtil.*;

/*
 * .join() : 대기상태로 만드는 것
 * 	 - 특정 스레드가 종료될 때까지 호출 스레드가 기다려야 하는 경우(대기상태/Waiting)
 * 	 - 특정 스레드가 특정한 결과값을 도출할 때까지 기다려야 하는 경우에 많이 활용
 * 		ex) 대용량 파일을 다운로드 > 실행
 * 
 * 	 // 방법1. sleep()을 통해서 특정 스레드가 종료될 때까지 시간제한대기상태(Time Waiting)
 * 	 // 방법2. .getState() 통해서 현재상태를 알아보는 방법
 * 	 // 방법3. .join() 메소드 사용
 * 
 */
public class Exam02 {
	
	static class Run implements Runnable{
		@Override
		public void run() {
			log(" - Thread:run() start; ");
			// 현재 스레드를 1초간 대기상태로 만듦
			//sleepThread(1000);
			//thread 스레드가 작업되는 5초동안 스스로를 대기상태로 만듬
			//thread.join(5000);
		};
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		log(" - main() start; ");
		
		Run r01 = new Run();
		Thread th01 = new Thread(r01, "th-01");
		Run r02 = new Run();
		Thread th02 = new Thread(r02, "th-02");
		
		th01.start();
		th02.start();
		
		// 방법 3.
		// main Thread(호출스레드)가
		// th01, th02(대상스레드)가 종료될 때까지 대기상태
		// * 무기한 대기상태 : WAITING
		//	 - 다른 스레드의 특정 작업이 완료되기를 무기한 기다리는 상태
		//	 - join()을 호출하는 스레드는 대상 스레드가 TERMINATEED(종료상태)가 될 때까지 대기
		//		> 종료상태가 되면 호출스레드(main Thread)는 Waiting > Runnable 자동으로 상태 변함
		/*
		 * 	 - .join()						: 무한정 대기 상태
		 * 		.join(long milli-seconds)	
		 * 			: 특정시간 만큼 대기상태(Timed Waiting)
		 * 			/ 시간이 지나기 전에 대상 스레드가 종료되면, 더이상 기다리지 않고 실행상태 변경
		 * 			ex) {대상스레드}.join(1000)
		 * 			: 중간에 중단이 가능(Interrupted)
		 * 
		 * 			cf) .sleep(long milli-seconds) : 대상이 다름
		 * 				: 현재 스레드를 일정시간 만큼 대기
		 * 				: 중간에 중단이 불가능(Interrupted)
		 * 
		 */
		// th01을 1초간 main(자신)이 기다림
		//th01.join(1000);
		
		// 종료되지 않았다면 while 문 안의 내용을 실행(대기상태)
		//	 * 단점 : 계속되는 반복문은 CPU 연산을 지속적으로 사용 / 번거로움
		while(th01.getState() != Thread.State.TERMINATED) {
			// 스레드가 종료될 때 까지 계속 반복해서 ... 실행
			sleepThread(10);
		}
		
		// main(자신)을 1초간 기다림
		sleepThread(1000);
		
		th02.join();
		
		
		log(" - main() end; ");
		
	}
	
	
}
