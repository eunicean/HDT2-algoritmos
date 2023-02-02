package project;

import java.util.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testclass {
	@Test
	public void testcalculator1() {
		ArrayList<String> r = new ArrayList<>(Arrays.asList("4","5","+"));
		OCalculator myc = new OCalculator();
		myc.setListOfCharacters(r);
		assertEquals(9, myc.calculate());
	}
	
	@Test
	public void testcalculator2() {
		OCalculator myc = new OCalculator();
		
		myc.Push("1");
		myc.Push("2");
		
		assertEquals((float)2.0,myc.Pop());
	}
}
