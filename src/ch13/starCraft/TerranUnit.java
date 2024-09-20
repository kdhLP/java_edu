package ch13.starCraft;

/*
 *  ���� �� ������ �ڵ�� ������
 *  
 *  TerranUnit > ���ֵ��� �θ� Ŭ����
 *  	- Q2. Marine / Medic / FireBat �ڽ� Ŭ������ ����
 *  
 *  Q3. ���ֵ��� Ÿ�� �̵��� �� �ִ� Shuttle Ŭ������ ���弼��
 *  	- ���׸� Ÿ���� ���
 *  	- Shuttle�� ž�� �� �� �ִ� ��ü�� TerranUnit�� ����
 *  	- ** Shuttle�� ž���� �� �ִ� ������ ���� �� 8�� �Դϴ�.
 *  	- showInfo() �޼ҵ带 ���ؼ� ž���� ������ ������ ���
 *  
 */
// Object Ŭ������ ��� Ŭ������ �ֻ��� �θ� Ŭ����
// ������ ��� : ������ Ŭ������ extends Object Ű���� ����
public class TerranUnit {
	private String name;
	private int hp;
	
	// ������
	public TerranUnit(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	// Q1. �ʵ��� ������ �������� getter
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	
	// Object Ŭ�������� toString() �޼ҵ带 ��ӹ޾� ������
	@Override
	public String toString() {
		return "���� ���� ( �̸� : " + this.name
				+ ", hp : " + this.hp+ " ) ";
	}
	
	
}
