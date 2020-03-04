package cit360.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Magic 8 Ball");
	}

	@Before
	public void setup() {
		System.out.println("Ask Magic 8 Ball a question");
	}

	@Test
	public void test() {
		System.out.println("'Don't count on it.'");
	}
	
	@Test
	public void test2() {
		System.out.println("'Ask again later.'");
	}
	
	@Test
	public void test3() {
		System.out.println("'It is decidedly so.'");
	}
	
	@After
	public void teardown() {
		System.out.println("Shake Magic 8 Ball");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Give to friend");
	}
}