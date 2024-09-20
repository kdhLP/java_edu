package util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// 추상클래스
public class CommonUtil {
	
	// 맴버변수
	private static final DateTimeFormatter fm
				= DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
	// 로그
	public static void log(Object obj) {
		String time = LocalTime.now().format(fm);
		System.out.printf("%s [%10s] %s\n",
				time,
				Thread.currentThread().getName(),
				obj);
	}
	
	// sleep
	public static void sleepThread(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// e.getMessage() : 예외상황에 대한 단단한 내용
			log("InterruptedException 발생"+e.getMessage());
			e.printStackTrace();
		}
	}

}










