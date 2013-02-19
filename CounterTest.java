import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;


public class CounterTest {

	@Test
	public void test() {
		
		Integer first, mockedFirst;
		Integer expectedFirst = 1;
		Counter count = new Counter();
		
		Counter mockedCounter = mock(Counter.class); //This tells Mockito to create a class of type mock
		when(mockedCounter.getValue()).thenReturn(1).thenReturn(2).thenReturn(3); //This tells Mockito that when getValue() is called the first 
		//time it should return 1, then 2 etc
		
		first = count.getValue();
		mockedFirst = mockedCounter.getValue(); //Mocked class interfaced like the real thing
		
		assertEquals("Wrong Answer!", expectedFirst, first);
		
		first = count.getValue();
		mockedFirst = mockedCounter.getValue();
		
		assertEquals("Wronge Answer !",first , mockedFirst);
		
		first = count.getValue();
		mockedFirst = mockedCounter.getValue();
		
		verify(mockedCounter,atMost(4)).getValue(); //This tells Mockito to check that ‘getValue’ has been called at least 4 times
		
		assertEquals("Wronge Answer !",first , mockedFirst);
	}

}

