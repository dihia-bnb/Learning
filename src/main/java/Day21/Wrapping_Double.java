package Day21;

public class Wrapping_Double {

	public static void main(String[] args) {

	}

	public static void stringToInteger() {

		String price1 = "400";
		String price2 = "250";
		System.out.println("Total price of the commodies is : " + (price1 + price2));

		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		System.out.println("Total price of the commodies is : " + (p1 + p2));

	}

	public static void stringToDouble() {

		String price1 = "1.11";
		String price2 = "2.5";
		System.out.println("Total price of the commodies is : " + (price1 + price2));

		double p1 = Double.parseDouble(price1);
		double p2 = Double.parseDouble(price2);
		System.out.println("Total price of the commodies is : " + (p1 + p2));

	}
	
	public static void stringToBoolean() {
		String result1 = "true";
		String result2 = "false";
		
		boolean r1 = Boolean.parseBoolean(result1);
		boolean r2 = Boolean.parseBoolean(result2);
		
		System.out.println(r1 == r2);

	}

	public static void stringToLong() {

	}

}
