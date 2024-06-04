package alex.junit;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import alex.MyMath;

class MyMathTest {
	
	@BeforeEach
	void beforeEach() {
		System.out.println("before Each");
	}
	
	private MyMath math =new MyMath();
	@Test
	void test() {
		assertEquals(6, math.calculateSum(new int[] {1,2,3}));	
	}
	
	@Test
	void test1() {
		assertEquals(0 , math.calculateSum(new int[] {}));	
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("after all");
	}
	

}
