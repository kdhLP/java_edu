package ch06.memory;

public class MathMain {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6};
		
		MathArrayUtil.sum(numbers);
		MathArrayUtil.average(numbers);
		MathArrayUtil.min(numbers);
		MathArrayUtil.max(numbers);
	}

}
