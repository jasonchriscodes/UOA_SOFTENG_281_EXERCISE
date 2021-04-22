class Main {
	public static void main(String[] args) {

		Colour r1 = new Colour("Red", 255, 0, 0);
		Colour r2 = new Colour("Red", 255, 0, 0);
		Colour r3 = new Colour("Rouge", 255, 0, 0);
//		Colour r3 = r1;
		Colour r4 = null; // obj type null

		System.out.println("Checking identity:");
		
		if (r1 == r1) {
			System.out.println("\tr1 and r1: SAME identity.");
		} else {
			System.out.println("\tr1 and r1: DIFFERENT identity.");
		}

		if (r1 == r2) {
			System.out.println("\tr1 and r2: SAME identity.");
		} else {
			System.out.println("\tr1 and r2: DIFFERENT identity.");
		}

		if (r2 == r3) {
			System.out.println("\tr2 and r3: SAME identity.");
		} else {
			System.out.println("\tr2 and r3: DIFFERENT identity.");
		}

		if (r1 == r3) {
			System.out.println("\tr1 and r3: SAME identity.");
		} else {
			System.out.println("\tr1 and r3: DIFFERENT identity.");
		}
		
		if (r1 == r4) {
			System.out.println("\tr1 and r4: SAME identity.");
		} else {
			System.out.println("\tr1 and r4: DIFFERENT identity.");
		}

		System.out.println("Checking equality:");

		if (r1.equals(r1)) {
			System.out.println("\tr1 and r1: SAME equality.");
		} else {
			System.out.println("\tr1 and r1: DIFFERENT equality.");
		}
		
		if (r1.equals(r2)) {
			System.out.println("\tr1 and r2: SAME equality.");
		} else {
			System.out.println("\tr1 and r2: DIFFERENT equality.");
		}

		if (r2.equals(r3)) {
			System.out.println("\tr2 and r3: SAME equality.");
		} else {
			System.out.println("\tr2 and r3: DIFFERENT equality.");
		}

		if (r1.equals(r3)) {
			System.out.println("\tr1 and r3: SAME equality.");
		} else {
			System.out.println("\tr1 and r3: DIFFERENT equality.");
		}
		
		if (r1.equals(r4)) {
			System.out.println("\tr1 and r4: SAME equality.");
		} else {
			System.out.println("\tr1 and r4: DIFFERENT equality.");
		}

	}
}