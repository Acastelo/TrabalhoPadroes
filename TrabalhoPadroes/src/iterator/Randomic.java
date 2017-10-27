package iterator;

import java.util.Random;

public class Randomic {

	public static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("O valor m�ximo deve ser maior que o m�nimo!");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}
