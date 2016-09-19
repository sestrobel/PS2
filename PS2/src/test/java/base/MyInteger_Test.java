package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//tests methods that take MyInteger.method(int)
		assertTrue(MyInteger.isPrime(11));
		assertFalse(MyInteger.isPrime(10));
		assertFalse(MyInteger.isPrime(9));
		assertFalse(MyInteger.isPrime(1));
		assertTrue(MyInteger.isPrime(2));
		assertTrue(MyInteger.isOdd(9));
		assertFalse(MyInteger.isOdd(8));
		assertTrue(MyInteger.isEven(8));
		assertFalse(MyInteger.isEven(9));
		
		//tests methods that take instance.method()
		MyInteger theInt = new MyInteger(5);
		assertTrue(theInt.getiValue()==5);
		assertTrue(theInt.isPrime());
		assertTrue(theInt.isOdd());
		assertFalse(theInt.isEven());
		MyInteger nowAnotherOne = new MyInteger(77);
		assertTrue(nowAnotherOne.getiValue()==77);
		assertFalse(nowAnotherOne.isPrime());
		assertTrue(nowAnotherOne.isOdd());
		assertFalse(nowAnotherOne.isEven());
		MyInteger evenMore = new MyInteger(8);
		assertTrue(evenMore.getiValue()==8);
		assertFalse(evenMore.isPrime());
		assertFalse(evenMore.isOdd());
		assertTrue(evenMore.isEven());
		MyInteger evenMore1 = new MyInteger(1);
		assertTrue(evenMore1.getiValue()==1);
		assertFalse(evenMore1.isPrime());
		MyInteger evenMore2 = new MyInteger(2);
		assertTrue(evenMore2.getiValue()==2);
		assertTrue(evenMore2.isPrime());
		
		//tests methods that take MyInteger.method(instance)
		MyInteger theInt1 = new MyInteger(5);
		assertTrue(theInt1.getiValue()==5);
		assertTrue(MyInteger.isPrime(theInt1));
		assertTrue(MyInteger.isOdd(theInt1));
		assertFalse(MyInteger.isEven(theInt1));
		MyInteger nowAnotherOne1 = new MyInteger(77);
		assertTrue(nowAnotherOne1.getiValue()==77);
		assertFalse(MyInteger.isPrime(nowAnotherOne1));
		assertTrue(MyInteger.isOdd(nowAnotherOne1));
		assertFalse(MyInteger.isEven(nowAnotherOne1));
		MyInteger evenMore3 = new MyInteger(8);
		assertTrue(evenMore3.getiValue()==8);
		assertFalse(MyInteger.isPrime(evenMore3));
		assertFalse(MyInteger.isOdd(evenMore3));
		assertTrue(MyInteger.isEven(evenMore3));
		MyInteger evenMore4 = new MyInteger(1);
		assertTrue(evenMore4.getiValue()==1);
		assertFalse(MyInteger.isPrime(evenMore4));
		MyInteger evenMore5 = new MyInteger(2);
		assertTrue(evenMore5.getiValue()==2);
		assertTrue(MyInteger.isPrime(evenMore5));
		
		assertTrue(evenMore5.getiValue() == 2);
		evenMore5.setiValue(7);
		assertTrue(evenMore5.getiValue() == 7);
		assertTrue(evenMore5.equals(7));
		assertFalse(evenMore5.equals(8));
		MyInteger evenMore6 = new MyInteger(7);
		assertTrue(evenMore6.equals(evenMore5));
		assertFalse(evenMore5.equals(evenMore3));


	}

}
