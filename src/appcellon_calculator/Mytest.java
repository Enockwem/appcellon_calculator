package appcellon_calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Mytest {
	Testmethod mtesting = new Testmethod();
	@Test
	void Addtest() {
		
		int result = mtesting.Add(15, 14);
		assertEquals(29,result);
	}
	@Test
	void Subtest() {
		int result = mtesting.Subtract(15, 14);
		assertEquals(1,result,"This is correct");
	}
	@Test
	void Multest() {
		double result = mtesting.Multiply(15,2);
		assertEquals(30,result);
	}
	@Test
	void Divtest() {
		double result = mtesting.Divide(10,2);
		assertEquals(5,result);
	}
	
}
