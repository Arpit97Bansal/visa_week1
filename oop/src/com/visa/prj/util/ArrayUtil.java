package com.visa.prj.util;
import java.util.Arrays;

public class ArrayUtil {
	
	public static void sort(Comparable[] elems)
	{
		for (int i = 0; i < elems.length; i++) {
			
			for (int j = i+1; j < elems.length; j++) {
				
				if(elems[i].compareTo(elems[j])>0)
				{
					Comparable temp = elems[i];
					elems[i] = elems[j];
					elems[j] = elems[i];
				}
				
			}
			
		}
	}
	
	public static int getSum(int[] data)
	{
		int sum = 0;
		for(int i=0;i<data.length;++i)
		{
			sum += data[i];
		}
		return(sum);
	}
	
	public static void sort(int[] elems)
	{
		//Arrays.sort(elems);
		int now = 0;
		
		for(int i=1; i<elems.length; ++i )
		{
			now = elems[i];
			int j = i-1;
			for(j=i-1;j>=0;--j)
			{
				if(elems[j] > now)
				{
					elems[j+1] = elems[j];
					
				}
				else
				{
					elems[j+1] = now;
					break;
				}
			}
			if(j==-1)
			{
				elems[0] = now;
			}
		}
		
	}
	
	public static int getCount(int[] elems, int no)
	{
		int r = 0;
		for(int i=0;i<elems.length;++i)
		{
			if(elems[i]==no)
			{
				r++;
			}
		}
		return(r);
	}
	
	public static int[] convert(int[][] data)
	{
		int l = data.length * data[0].length ;
		int [] D = new int[l];
		
		int k = 0;
		
		for(int i=0;i<data.length;++i)
		{
			for(int j=0; j < data[i].length; ++j)
			{
				D[k] = data[i][j];
				++k;
			}
		}
		
		return(D);
	}

}
