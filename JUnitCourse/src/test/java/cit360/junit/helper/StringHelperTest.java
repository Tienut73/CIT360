package cit360.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cit360.junit.helper.StringHelper;


public class StringHelperTest {
		
	StringHelper helper;
		//AACD => CD ACD => CD CDEF => CDEF CDAA => CDAA
	
	@Before
	public void before() {
		helper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		//expected,actual
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPositions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
		@Test
		public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
			assertFalse(
					helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		}
		//ABCD => false, ABAB => true, AB => true, A => false, 
		@Test
		public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
			assertTrue(
					helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		}
		
}