package appcellon_calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Mytest {
	Testmethod mtesting = new Testmethod();
	@Test
	void test() {
		
		int result = mtesting.Add(15, 14);
		assertEquals(29,result);
		
	}
	@Test
	void subtest() {
		int result = mtesting.Subtract(15, 14);
		assertEquals(1,result,"This is correct");
	}
	@Test
	void multest() {
		double result = mtesting.Multiply(15,2);
		assertEquals(30,result);
	}
	@Test
	void divtest() {
		double result = mtesting.Divide(10,2);
		assertEquals(5,result);
	}
	
}
