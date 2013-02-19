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
		Integer third, mockedThird;
		
		Counter2 counter = new Counter2();
		
		Counter2 mockedCounter = mock(Counter2.class);
		when(mockedCounter.getValue(1)).thenReturn(1).thenReturn(2);//This tells Mockito what to answer on invocation with ‘1’
		when(mockedCounter.getValue(2)).thenReturn(2).thenReturn(4);//This tells Mockito what to answer on invocation with ‘2’
		when(mockedCounter.getValue(3)).thenReturn(-1);
		
		first = counter.getValue(1);
		second = counter.getValue(2);
		third = counter.getValue(3);
		mockedFirst = mockedCounter.getValue(1);
		mockedSecond = mockedCounter.getValue(2);
		mockedThird = mockedCounter.getValue(3);
		
		assertEquals("First first wrong Answer !", first, mockedFirst);
		assertEquals("First second Wrong Answer !", second, mockedSecond);
		assertEquals("First third wrong answer!", third, mockedThird);
		
		/*first = counter.getValue(1);
		second = counter.getValue(2);
		mockedFirst = mockedCounter.getValue(1);
		mockedSecond = mockedCounter.getValue(2);
		
		assertEquals("Second first Answer !", first, mockedFirst);
		assertEquals("Second second Answer !", second, mockedSecond);*/
		
	}

}
