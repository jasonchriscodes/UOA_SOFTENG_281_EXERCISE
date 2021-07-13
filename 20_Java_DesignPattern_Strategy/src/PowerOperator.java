
public class PowerOperator implements Operator {

	@Override
	public int execute(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}

}
