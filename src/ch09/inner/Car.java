package ch09.inner;

public class Car {
	// �� �̸�
	private String modelName;
	
	// ����Ŭ������ ��������� �� Engine
	private Engine engine;
	// �⸧ �ܿ���
	private int gasLevel;
	
	// ������
	public Car( String modelName, int gasLevel ) {
		// �����ڸ� ���ؼ� ��ü�� �����Ǿ��� ��, �� �ν��Ͻ��� ���´� Ű���� : this
		this.modelName = modelName;
		this.gasLevel = gasLevel;
		// ��ü�� ���� > �ش� Ŭ������ �����ڸ� �����Ŵ
		this.engine = new Engine();
	}
	
	public void start() {
		engine.start();
		System.out.println(this.modelName + " �õ� �Ϸ�");
	}
	
	class Engine {
		
		public void start() {
			
			System.out.println("�⸧ �ܿ��� Ȯ��: " + gasLevel );
			System.out.println( modelName + "�� ������ �õ��� �մϴ�.");
			
		}
		
	}
	
}
