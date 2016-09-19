package base;

public class MyInteger {
	private int iValue;

	MyInteger(int num) {
		iValue = num;
		// constructor! 
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		// sets iValue attribute for an instance of MyInteger
		this.iValue = iValue;
	}

	public static boolean isEven(int num) {
		// takes integer as parameter
		// returns bool that matches whether or not the integer is even
		// isEven(num)
		if (num % 2 == 0)
			return true;
		return false;
	}

	public static boolean isOdd(int num) {
		// returns bool that matches whether or not the integer is odd
		if (num % 2 == 1)
			return true;
		return false;
	}

	public static boolean isPrime(int num) {
		// returns bool that matches whether or not the integer is prime
		if (num < 2)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;
		for (int i = 3; i * i <= num; i += 2)
			if (num % i == 0)
				return false;
		return true;
	}

	public boolean isEven() {
		// method for class MyInteger
		// returns bool that matches whether or not iValue of an instance of
		// MyInteger is even
		// instance.isEven()
		if (this.iValue % 2 == 0)
			return true;
		return false;
	}

	public boolean isOdd() {
		// method that returns bool that matches whether or not iValue of an
		// instance of MyInteger is even
		if (this.iValue % 2 == 1)
			return true;
		return false;
	}

	public boolean isPrime() {
		// method that returns bool that matches whether or not iValue of an
		// instance of MyInteger is prime

		if (this.iValue < 2)
			return false;
		if (this.iValue == 2)
			return true;
		if (this.iValue % 2 == 0)
			return false;
		for (int i = 3; i * i <= this.iValue; i += 2)
			if (this.iValue % i == 0)
				return false;
		return true;
	}

	public static boolean isEven(MyInteger theInt) {
		// method that takes instance of MyInteger,
		// returns bool that matches whether or not iValue of an instance of
		// MyInteger is even
		// MyInteger.isEven(instance)
		if (theInt.iValue % 2 == 0)
			return true;
		return false;
	}

	public static boolean isOdd(MyInteger theInt) {
		// method that returns bool that matches whether or not iValue of an
		// instance of MyInteger is even
		if (theInt.iValue % 2 == 1)
			return true;
		return false;
	}

	public static boolean isPrime(MyInteger theInt) {
		// method that returns bool that matches whether or not iValue of an
		// instance of MyInteger is prime

		if (theInt.iValue < 2)
			return false;
		if (theInt.iValue == 2)
			return true;
		if (theInt.iValue % 2 == 0)
			return false;
		for (int i = 3; i * i <= theInt.iValue; i += 2)
			if (theInt.iValue % i == 0)
				return false;
		return true;
	}

	public boolean equals(int num) {
		// takes integer as parameter
		// returns bool that matches whether or not the integer is equal to
		// iValue
		// instance.equals(num)
		if (this.iValue == num)
			return true;
		return false;
	}

	public boolean equals(MyInteger theInt) {
		// takes instance of MyInteger as parameter
		// returns bool that matches whether or not the integer is even
		// instance.equals(instance2)
		if (theInt.iValue == this.iValue)
			return true;
		return false;
	}

}
