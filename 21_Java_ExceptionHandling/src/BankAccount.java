public class BankAccount {

	private double balance;
	private int transactionsLimit;
	private int transactions = 0;

	/**
	 * Construct a BackAccount instance with given initial balance and transactions limit
	 *
	 * @param initialBalance
	 * @param transactionsLimit
	 */
	public BankAccount(double initialBalance, int transactionsLimit) {
		this.balance = initialBalance;
		this.transactionsLimit = transactionsLimit;
	}

	/**
	 * Default constructor
	 */
	public BankAccount() {
		this(0, 10);
	}

	/**
	 * returns the current balance
	 *
	 * @return
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * return the transaction limit associated to the account
	 *
	 * @return
	 */
	public int getTransactionsLimit() {
		return transactionsLimit;
	}


	/**
	 * Add the given amount to the balance
	 *
	 * @param amount
	 */
	public void deposit(double amount) {

		if (transactions == transactionsLimit) {
			System.out.println("transactions limit reached");
			return;
		}

		if (transactions < transactionsLimit) {
			balance += amount;
			transactions++;
		}
	}

	/**
	 * Subtract the given amount from balance
	 *
	 * @param amount
	 */
	public void withdraw(double amount) {
		if (transactions == transactionsLimit) {
			System.out.println("transactions limit reached");
			return;
		}
		if (balance >= amount) {
			balance -= amount;
			transactions++;
		} else {
			System.out.println("amount exceeded");
		}
	}


	/**
	 * Transfer the given amount to Account recipient
	 *
	 * @param amount
	 * @param recipient
	 */
	public void transferTo(double amount, BankAccount recipient) {
		if (this.transactions == this.transactionsLimit || recipient.transactions == recipient.transactionsLimit) {
			System.out.println("transactions limit reached");
			return;
		}
		if (this.balance >= amount) {
			withdraw(amount);
			recipient.deposit(amount);
		} else {
			System.out.println("amount exceeded");
		}
	}

}

