package com.ncq.Ladder;
public class Test {

	 public static void main(String[] args) {

         int n = 5; 
         
         Ladder ladder = new Ladder(n);
         System.out.println("Number of ways = "+ ladder.countWays(n)); 
}
}
