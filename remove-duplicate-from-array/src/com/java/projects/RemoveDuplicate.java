package com.java.projects;

import java.util.stream.IntStream;

public class RemoveDuplicate
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		String[] names = { "India", "USA", "Australia", "China", "Spain", "India", "USA" };
		
	
	
		
	//	System.out.println(name.contains("India"));
	//	removeDuplicateWithNull(names);
		
		removeDuplicateWithIndex(names);

	}

	private static void removeDuplicateWithIndex(String[] names)
	{
		// TODO Auto-generated method stub
		int rejectedIndex [] = new int[names.length];
		
		for (int i = 0; i < names.length; i++) 
		{
			
			int k = i;  // this is because we cannot use i in lambda expression
			boolean isMatched = IntStream.of(rejectedIndex).anyMatch(x -> x == k);
			if (!isMatched) 
			{
				System.out.println(names[i]);
				for (int j = i + 1; j < names.length; j++) {
					if (names[i].equals(names[j])) {
						rejectedIndex[i] = j;
					}
				} 
			}
		}
		System.out.println(rejectedIndex);
	}

	private static void removeDuplicateWithNull(String[] names)
	{
		for (int c = 0; c < names.length; c++) 
		{
			String name = names[c];
			if (!name.equals("null")) {
				for (int ic = c + 1; ic < names.length; ic++) {
					String iName = names[ic];
					if (name.equals(iName)) {
						names[ic] = "null";
					}
				}
				System.out.println(name);
			}

		}
	}

}
