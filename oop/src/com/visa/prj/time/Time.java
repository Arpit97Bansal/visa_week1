package com.visa.prj.time;

public class Time 
{
	private int hrs;
	private int mins;
	
	public Time(int h, int m)
	{
		this.hrs = h;
		this.mins = m;
	}
	
	public int getHours()
	{
		return this.hrs;
	}
	
	public int getMins()
	{
		return this.mins;
	}
	
	public static Time addTime(Time t1, Time t2)
	{
		int h = t1.hrs + t2.hrs;
		int m = t1.mins + t2.mins;
		
		if(m >= 60)
		{
			m = m-60;
			h = h + 1;
		}
		
		Time t3 = new Time(h,m);
		return t3;
		
	}
	
	public Time addTim(Time t2)
	{
		int h = this.hrs + t2.hrs;
		int m = this.mins + t2.mins;
		
		/*
		if(m >= 60)
		{
			m = m-60;
			h = h + 1;
		}
		*/
		h = h + m/60;
		m = m%60;
		
		Time t3 = new Time(h,m);
		return t3;
		
	}
	
	
}
