package Day13;

public class Assgnment {
	String name;
	int age;
	int mobileNumber;
	double balance;

	static boolean result;
	static int amount;

	public static void main(String[] arg) {
     openCheckingAccount();
     applyForCreditCard();
     result=true;
     amount=1452;
     Assgnment assgnment = new Assgnment();
     assgnment.withDrawCashFromATM();
     assgnment.doNeftTransfer();
     assgnment.applyForMobileBanking();
     assgnment.age=2;
     assgnment.name="john";
     assgnment.balance=1254;
    
	}

	public static void openCheckingAccount() {
		System.out.println("This is static method to open a Checking Acc.");
	}

	public static void applyForCreditCard() {
		System.out.println("This is static method to apply for a Credit Card");
	}

	public void withDrawCashFromATM() {
		System.out.println("ATM Cash withdraw");
	}

	public void doNeftTransfer() {
		System.out.println("Neft Wire Transfer");
	}

	public void applyForMobileBanking() {
		System.out.println("Mobile App with face recognition");
	}
}
