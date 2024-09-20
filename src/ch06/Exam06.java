package ch06;

import ch06.access.a.AccessData;

// ����������
/* 
 * ��ü������� 'ĸ��ȭ(Encapsulation)' ����� ������ ����
 * 		- ������ ��ü �ܺο��� ���� �������� ������ ����
 * 		- ����ȭ(���� ����)
 * 
 * ���������� ����
 * 		1. public : ��� �ܺ��� ȣ��(���)�� ���
 * 		2. protected : ���� ��Ű�� �ȿ��� ȣ���� ��� / �ٸ� ��Ű���� Ŭ���� ���� ȣ���� ���.
 * 		2-1. default(�⺻��) : ���� ��Ű�� �ȿ��� ȣ���� ��� / �ٸ� ��Ű���� Ŭ���� ���� ȣ���� ������� ����.
 * 		3. private : ��� �ܺ� ȣ���� ����
 * 			ex) ����� Ű - ����(�����), ȯ����� ������ ������ ���������� ������ �� ���� ����.
 * 
 */
public class Exam06 {
	
	public static void main(String[] args) {
		// �⺻ �����ڸ� ���ؼ� ��ü�� �����
		// mainSpeaker.power - on / mainSpeaker.volumn - 5
		// ��ü�� Speaker - public : ��� ������ ���
		Speaker mainSpeaker = new Speaker();
		// *****************************************************************
		// 		1. �ܺο��� ���� �ɹ������� ���� �������� ���ϵ��� �մϴ�. : 31
		//			- �ɹ� ��������  private ��� 
		// 		2. �ܺο��� private �����Ϳ� �����ϰų�(���� �˷��� �� ��) ����(����)�� ��, 
		//			method(getter, setter )�� ���ؼ� �����͸� �����ϵ��� �մϴ�.
		//			- method���� public ���������ڸ� ���
		//		ex. ���� ������ : ���� private / method(�ൿ/���)�� ���ؼ� ��ȸ, ���� 
		// *****************************************************************
		// Speaker.volumn �ɹ� ������ public : ��� ������ ���
		// 		protected : ���� ��Ű�� ���
		//mainSpeaker.volumn = 100;
		// ������ �����ϴ� �޼ҵ� ȣ��(����)
		//mainSpeaker.voulumnDown();
		/*
		if ( mainSpeaker.power.equals("on")) {
			System.out.println(mainSpeaker.getVolumn());
		}else {
			System.out.println("����Ŀ�� �����ֽ��ϴ�.");
		}
		*/
		//int mainSpeakerVolumn = mainSpeaker.getVolumn();
		//mainSpeaker.showVolumn();
		//mainSpeaker.volumnUp();
		
		/*
		// ����������
		mainSpeaker.power = "������"; // Ŵ, ��, ������, ���� ����, turn on, system on, boot ...
		if(!mainSpeaker.power.equals("on")
				&& !mainSpeaker.power.equals("off")) {
			// on, off �� �ƴҰ�� ����ó��
			System.out.println("�ùٸ� ��ɾ �ƴմϴ�. (on / off �� ������ּ���.)");
			mainSpeaker.power = "off";
		}else {
			// on || off �� ���
		}
		 */
		
		//
		/*
		MiniSpeaker ms = new MiniSpeaker();
		// getter method
		System.out.println("�̴Ͻ���Ŀ�� ���� : " + ms.isPower());
		// setter method
		// �̴Ͻ���Ŀ : on
		ms.setPower(true);
		// getter method
		System.out.println("�̴Ͻ���Ŀ�� ���� : " + ms.isPower());
		
		// ����Ŀ�� ������ 9���� �÷ȴٰ�
		// ����Ŀ�� ������ 0���� ��������. (�޼ҵ带 ���ؼ�)
		// �޼ҵ带 ���ؼ� ������ �����ϰ�, ������ �� ���� �ش� volumn ���� ����ϼ���.
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
		
		// ** �پ��� ��Ȳ�� ���� ���� ������ Ȯ��
		// �Ʒ��� ���ú��ʹ� ��Ű�� ��ġ(���)�� �ſ�O��
		// 1. ch06.access.a.AccessData Class �� public���� ���� 
		//		-> ch.06.Exam06 Class���� ȣ�� ����
		AccessData innerAccess = new AccessData();
		// ���� ȣ��(���) Ȯ���� ���� �޼ҵ� ȣ��
		innerAccess.innerAcces();
	}
}
