package ch13.starCraft;

public class PythonMap {

	public static void main(String[] args) {

		// Q4. Shuttle 객체를 생성하고, 마린2, 메딕3, 파이어벳1을 탑승시킨 후,
		// showInfo() 메소드를 통해서 탑승정보를 출력
		// : 탑승정보.toString() - 유닛정보(...)

		Shuttle<TerranUnit> shuttle = new Shuttle<TerranUnit>();

		TerranUnit[] units = { 
				new Marine("마린1", 100), 
				new Marine("마린2", 100), 
				new Medic("메딕1", 80),
				new Medic("메딕2", 80), 
				new Medic("메딕3", 80), 
				new FireBat("파이어벳1", 120) 
				};

		for (TerranUnit unit : units) {
			shuttle.enter(unit);
		}

		shuttle.showInfo();
	}
}