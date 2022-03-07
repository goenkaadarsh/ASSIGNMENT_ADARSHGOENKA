package junit_5_basic;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {
	MathUtils mathutils;
	
	@BeforeAll
	static void beforeallinit() {
		System.out.println("this needs to run before all");
	}
	
	@BeforeEach
	void init() {
		mathutils=new MathUtils();
	}
	@AfterEach
	void cleanup() {
		System.out.println("cleaning up..");
	}
	@AfterAll
	static void afterAllinit() {
		System.out.println("The method needs to run after all");
	}
	@Nested
	@DisplayName("Add Method")
	class AddTest{
		@Test
		@DisplayName("Testing add method for positive methods")
		public void testAddPositive() {
			assertEquals(2, mathutils.add(1, 1));
		}
		@Test
		@DisplayName("Testing add method for negative methods")
		public void testAddNegative() {
			assertEquals(-2, mathutils.add(-1, -1));
		}
		
	}
		@Test
		@DisplayName("Testing Divide Method")
		public void testDivide() {
			assertThrows(ArithmeticException.class, ()-> mathutils.divide(2, 0), "Can't divide by zero");	
		}
		
		@Test
		@DisplayName("Multiply Method")
		public void testMultiply() {
			assertAll(
					()-> assertEquals(4, mathutils.multiply(2, 2)),
					()-> assertEquals(-1, mathutils.multiply(-1, 1))		
					);
		}
		int[] arr=new int[] {56, 34, 7,3, 54, 3, 34, 34, 53};
		@Test
		public void MaxValue() {
			int[] expected= {3,56};
			int[] MaxMinValue=mathutils.findMinMax(arr, 9);
			assertArrayEquals(expected, MaxMinValue,"should get max and min value");
		}
//		
//		@Test
//	    void ComputeCircleArea() {
//			MathUtils mathutils=new MathUtils();
//			assertEquals(314, mathutils.computeCircleArea(10), "should give coorrect area");
//		}
//		
//
//	}

	

}
