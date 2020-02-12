package com.ncq.Ladder;

public class Ladder {
	
	private int n;
	
	public Ladder(int n) {
		super();
		this.n = n;
	}
	
		
	int fib(int n) 
	{ 
		if (n == 1) { return 1; }
	    if (n ==2) { return 2; }
	    return fib(n-1) + fib(n-2); 
	} 
	      
	   
	public int countWays(int n) 
	{ 
		return fib(n); 
	} 
}
