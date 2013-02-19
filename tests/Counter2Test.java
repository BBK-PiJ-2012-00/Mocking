package tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import code.Counter2;


public class Counter2Test {

	@Test
	public void test() {

		Integer first, mockedFirst;
		Integer second, mockedSecond;
		
		Counter2 count = new Counter2();
		
		Counter2 mockedCounter = mock(Counter2.class);
		when(mockedCounter.getValue(1)).thenReturn(1).thenReturn(2);
		when(mockedCounter.getValue(2)).thenReturn(2).thenReturn(4);
		
		first = count.getValue(1);
		second = count.getValue(2);
		mockedFirst = mockedCounter.getValue(1);
		mockedSecond = mockedCounter.getValue(2);
		
		assertEquals("First first wrong Answer !", first, mockedFirst);
		assertEquals("First second Wrong Answer !", second, mockedSecond);
		
		first = count.getValue(1);
		second = count.getValue(2);
		mockedFirst = mockedCounter.getValue(1);
		mockedSecond = mockedCounter.getValue(2);
		
		assertEquals("Second first Answer !", first, mockedFirst);
		assertEquals("Second second Answer !", second, mockedSecond);
		
	}

}
