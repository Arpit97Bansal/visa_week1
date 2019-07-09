package com.visa.prj.time;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void testGetHours() {
		Time t1 = new Time(3, 40);
		int e = 3;
		int g = t1.getHours();
		assertEquals(e, g);
	}

	@Test
	void testGetMins() {
		Time t1 = new Time(3, 40);
		int e = 40;
		int g = t1.getMins();
		assertEquals(e, g);
	}

	@Test
	void testAddTime() 
	{
		Time t1 = new Time(3,20);
		Time t2 = new Time(5,20);
		
		Time t3 = Time.addTime(t1, t2);
		Time t4 = new Time(8,40);
		
		assertEquals(t3.getHours(), t4.getHours());
		assertEquals(t3.getMins(), t4.getMins());
				
		
	}

	@Test
	void testAddTim() 
	{
		Time t1 = new Time(3,20);
		Time t2 = new Time(5,20);
		
		Time t3 = t1.addTim(t2);
		Time t4 = new Time(8,40);
		
		assertEquals(t3.getHours(), t4.getHours());
		assertEquals(t3.getMins(), t4.getMins());
	}

}
