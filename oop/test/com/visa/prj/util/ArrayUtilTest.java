package com.visa.prj.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayUtilTest {

	@Test
	public void testGetSum() 
	{
		int[] data= {5,4,3,2,1,10};
		int expected = 25;
		assertEquals(expected,ArrayUtil.getSum(data));
		
	}

	@Test
	public void testSort() 
	{
		int[] data= {5,4,3,2,1,10};
		int[] expected = {1,2,3,4,5,10};
		ArrayUtil.sort(data);
		assertArrayEquals(expected,data);
	}

	@Test
	public void testconvert() 
	{
		int[][] data= {{1,2,3},{4,5,6}};
		int[] expected = {1,2,3,4,5,6};
		int [] n = ArrayUtil.convert(data);
		assertArrayEquals(expected,n);
	}
	
	@Test
	public void testGetCount() 
	{
		int[] data= {66,2,66,23,55,66};
		int expected = 3;
		assertEquals(expected,ArrayUtil.getCount(data,66));
	}

}
