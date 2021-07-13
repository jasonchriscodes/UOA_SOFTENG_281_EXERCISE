class Main {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount(10,3);
		
		try {
			bank.deposit(10);
			bank.withdraw(1000); // should throw exception

			bank.deposit(10);
			bank.deposit(10);
			bank.deposit(5);// should throw exception
			
		} catch (BankException e) {
			System.out.println("Uh oh: " + e.getMessage());
//			e.printStackTrace();
			
		}
		System.out.println("End!");

	}
}