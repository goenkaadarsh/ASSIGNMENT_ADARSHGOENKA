package junit_5_basic;

public class BankAccount {
	
		long id;
		double balance;
		public  BankAccount(long id, double balance) {
			this.id = id;
			this.balance = balance;
		}
		public void withDraw(double Amount) throws Exception {
			if(Amount>balance) {
				throw new InsufficientBalanceException("Insufficent Balnce");
			}
			else if(Amount<-1) {
				throw new IllegalBankTransactionException("Illegal Bank Transaction");
			}
			else {
				System.out.println(balance-Amount);
			}
		}
		public void deposit(double Amount) {
			System.out.println(balance+Amount);
		}
		
	}

	@SuppressWarnings("serial")
	class InsufficientBalanceException extends Exception{
		public InsufficientBalanceException(String msg) {
			super(msg);
		
		}
	}
	@SuppressWarnings("serial")
	class IllegalBankTransactionException extends Exception{
		public IllegalBankTransactionException(String msg) {
			super(msg);
		}
	}
