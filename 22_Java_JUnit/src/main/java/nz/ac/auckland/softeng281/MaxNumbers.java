package nz.ac.auckland.softeng281;

import java.util.ArrayList;
import java.util.List;

public class MaxNumbers {

	private final List<Integer> numbers;

	public MaxNumbers() {
		numbers = new ArrayList<>();
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	/**
	 * add the number n only if it is not inside the list numbers.
	 * If the number is added returns true, returns false otherwise.
	 *
	 * @param n
	 * @return
	 */
	public boolean addNumber(int n) {
		if (!numbers.contains(n)) {
			numbers.add(n);
			return true;
		}
		return false;
	}

	/**
	 * BUGGY METHOD
	 *
	 * @return the maximum element in the list
	 */
	public int getMax()  {
		if (numbers.isEmpty()) {
			throw new CannotComputeTheMaximumListEmpty();
		}
		int max = numbers.get(0);
		for (int i = 0; i < numbers.size() - 1; i++) {
			if (numbers.get(i) > max) {
				max = numbers.get(i);
			}
		}
		return max;
	}
}