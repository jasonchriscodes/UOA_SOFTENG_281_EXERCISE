
public class Main {
	
	public static void main(String[] args) {
		
		MathOperation operation1 = new MathOperation(15, 15, new AddOperator());
		System.out.println(operation1.process());

		MathOperation operation2 = new MathOperation(15, 15, new SubtractOperator());
		System.out.println(operation2.process());

		MathOperation operation3 = new MathOperation(15, 15, new MultiplyOperator());
		System.out.println(operation3.process());

		MathOperation operation4 = new MathOperation(15, 15, new DivideOperator());
		System.out.println(operation4.process());

		MathOperation operation5 = new MathOperation(2, 10, new PowerOperator());
		System.out.println(operation5.process());

	}
}