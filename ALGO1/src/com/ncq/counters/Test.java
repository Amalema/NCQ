package com.ncq.counters;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {3, 4, 4, 6, 1, 4, 4};
		int n =5;
		Solution s = new Solution(n, A);
		s.calculCounters();
		System.out.println("counters {");
		for (int i =0; i<n; i++)
		{
			System.out.println(s.counters[i]);
		}
		
		System.out.println("}");
	}

}
