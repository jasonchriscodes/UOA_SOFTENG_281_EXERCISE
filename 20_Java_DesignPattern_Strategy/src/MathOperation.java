
public class MathOperation {

	private final String operator;
	private final int num1;
	private final int num2;

	public MathOperation(int num1, int num2, String operator) {
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
	}

	public int executeAddition(int num1, int num2) {
		return num1 + num2;
	}

	public int executeSubtraction(int num1, int num2) {
		return num1 - num2;
	}

	public int executeMultiplication(int num1, int num2) {
		return num1 * num2;
	}

	public int executeDivision(int num1, int num2) {
		return num1 / num2;
	}

	public int process() {
		switch (operator) {
		case "+":
			return executeAddition(num1, num2);
		case "-":
			return executeSubtraction(num1, num2);
		case "*":
			return executeMultiplication(num1, num2);
		case "/":
			return executeDivision(num1, num2);
		default:
			System.out.println("unknown operator");
			return -1;
		}
	}

}
