package junit_5_basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinMaxFinderTest {
	MinMaxFinder minmax;
	
	@BeforeAll
	static void BeforeAllinit() {
		System.out.println("Checking Min and Max");
	}
	
	@BeforeEach
	void init() {
		minmax=new MinMaxFinder();
	}
	int[] arr=new int[] {56, 34, 7,3, 54, 3, 34, 34, 53};
	

	@Test
	void MinMaxValue() {
		int[] expected= {3,56};
		int[] MaxMinValue=minmax.findMinMax(arr, 9);
		assertArrayEquals(expected, MaxMinValue,"should get max and min value");
		
	}

}
