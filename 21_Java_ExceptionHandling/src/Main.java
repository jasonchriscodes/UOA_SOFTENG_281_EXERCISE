class Main {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount(10,3);
		bank.deposit(10);
		bank.withdraw(1000); // should throw exception

		bank.deposit(10);
		bank.deposit(10);
		bank.deposit(5);// should throw exception

	}
}