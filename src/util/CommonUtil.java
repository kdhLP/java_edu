package util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// �߻�Ŭ����
public class CommonUtil {
	
	// �ɹ�����
	private static final DateTimeFormatter fm
				= DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
	// �α�
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
			// e.getMessage() : ���ܻ�Ȳ�� ���� �ܴ��� ����
			log("InterruptedException �߻�"+e.getMessage());
			e.printStackTrace();
		}
	}

}










