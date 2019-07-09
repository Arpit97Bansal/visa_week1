package com.visa.prj.timeclient;

import com.visa.prj.time.Time;

public class TimeClient 
{
	public static void main(String[] args)
	{
		Time t1 = new Time(4,30);
		Time t2 = new Time(3,45);
		
		Time t3 = Time.addTime(t1, t2);
		
		System.out.println(t3.getHours() + ":" + t3.getMins());
		
		Time t4 = t1.addTim(t2);
		
		System.out.println(t4.getHours() + ":" + t4.getMins());
		
	}
}
