package ch13.starCraft;

public class PythonMap {

	public static void main(String[] args) {

		// Q4. Shuttle ��ü�� �����ϰ�, ����2, �޵�3, ���̾1�� ž�½�Ų ��,
		// showInfo() �޼ҵ带 ���ؼ� ž�������� ���
		// : ž������.toString() - ��������(...)

		Shuttle<TerranUnit> shuttle = new Shuttle<TerranUnit>();

		TerranUnit[] units = { 
				new Marine("����1", 100), 
				new Marine("����2", 100), 
				new Medic("�޵�1", 80),
				new Medic("�޵�2", 80), 
				new Medic("�޵�3", 80), 
				new FireBat("���̾1", 120) 
				};

		for (TerranUnit unit : units) {
			shuttle.enter(unit);
		}

		shuttle.showInfo();
	}
}