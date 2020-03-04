package cit360.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {
	
	//Arrays.sort
	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = { 12, 3, 4, 1 };
		int[] expected = { 1, 3, 4, 12 };
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
		//arrays first differed at element [1];
		// expected:<4> but was:<3>
	}

	@Test (expected=NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);
		//arrays first differed at element [1];
		// expected:<4> but was:<3>
	}
	
	@Test(timeout=1000)
	public void testSort_Performance() {
		int array[] = { 12, 23, 4 };
		for(int i = 1; i <= 1000000;i++)
		{
			array[0] = i;
			Arrays.sort(array);
		}
	}
	

}
