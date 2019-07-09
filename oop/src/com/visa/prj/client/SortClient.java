package com.visa.prj.client;

import com.visa.prj.entity.Mobile;
import com.visa.prj.entity.Product;
import com.visa.prj.entity.TV;
import com.visa.prj.util.ArrayUtil;

public class SortClient {

	public static void main(String[] args) 
	{
		String[] names = {"Arpit","Amit","Bansal","Anjali"};
		
		ArrayUtil.sort(names);
		
		for (String string : names) {
			System.out.println(string);
		}
		Product[] products = new Product[4]; // Array of 4 pointers
		products[0] = new TV(133,"Sony Bravia",135000.00,"LED");
		products[1] = new Mobile(453,"MotoG",12999.00,"4G");
		products[2] = new TV(634,"Onida Thunder",3500.00,"CRT");
		products[3] = new Mobile(621,"iPhone XR",99999.00,"4G");
		
		ArrayUtil.sort(products);
		
		for (Product product : products) 
		{
			System.out.println(product);
		}
		
	}

}
