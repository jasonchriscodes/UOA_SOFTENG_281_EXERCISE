
public class MathOperation {

	private final Operator operator;
	private final int num1;
	private final int num2;

	public MathOperation(int num1, int num2, Operator operator) {
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
	}

	public int process() {
		return operator.execute(num1, num2);
	}

}
