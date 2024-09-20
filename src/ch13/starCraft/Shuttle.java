package ch13.starCraft;

public class Shuttle<T extends TerranUnit> {

	private Object[] units;
	private int count;

	public static final int MAX_UNIT = 8;

	public Shuttle() {
		units = new Object[MAX_UNIT];
		count = 0;
	}

	public void enter(T unit) {
		if (count < MAX_UNIT) {
			units[count] = unit;
			count++;
			System.out.println(unit.getName() + "ÀÌ(°¡) ¼ÅÆ²¿¡ Å¾½ÂÇß½À´Ï´Ù.");
		} else {
			System.out.println("¼ÅÆ²Àº 8¸íÀÌ ÇÑ°èÀÔ´Ï´Ù.");
		}
	}

	public void showInfo() {
		System.out.println("¼ÅÆ²¿¡ Å¾½ÂÇÑ À¯´Ö Á¤º¸ : ");
		for (int i = 0; i < count; i++) {
			T unit = (T) units[i];
			System.out.println(unit.toString());
		}
	}
}