package com.ncq.counters;

public class Solution {
	
	private int n;
	private int[] A;
	public int[] counters;
	
	public Solution(int n, int[] a) {
		super();
		this.n = n;
		A = a;
		counters = new int [n];
		for (int i=0;i<n;i++)
		{
			counters[i]=0;
		}
	}

	public int[] calculCounters()
	{
		for(int i=0; i<A.length; i++)
		{
			if ((A[i] >= 0) && (A[i] <= n))
				increase(A[i]-1);
			else
				maxCounter();
		}
		
		return counters;
	}
	
	public int increase(int i)
	{
		return counters[i]++;	
	}
	
	public int max()
	{
		int max = counters[0];
		for (int i=1; i<n; i++)
		{
			if (counters[i] > max)
				max = counters[i];
		}
		
		return max;
	}
	
	public int[] maxCounter()
	{
		int max = max();
		for(int i=0; i<n; i++)
		{
			counters[i] = max;
		}
		return counters;
	}
	

}
