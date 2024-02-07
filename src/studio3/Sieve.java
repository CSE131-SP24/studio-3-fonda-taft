package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("What is n?");
		int n=in.nextInt();
		
		boolean [] prime = new boolean[n];
		
		for (int i = 2; i < n+2; i++)
		{
			for ( int row = 2; row < n+2; row = row + i) {
				prime [i-2] = true; 
			System.out.println(true);
			}
	
	
		    
		    
		}
			
		}

	}


