package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Your integer: ");
	    int maxNum = scan.nextInt();
	    
	    boolean[] bool = new boolean[maxNum+1];
	    
	    for (int i = 0; i < bool.length; i++) {
	    	bool[i] = true;
	    }
	    
	    for (int e = 2; e*e <= maxNum; e++) {
	    	bool[e*e] = false;
	    	
	    	for (int c = e; c * e <= maxNum; c++) {
	    		bool[c*e] = false;
	    	}
	    }
	    /*
	    
	    
	    for (int i = 2; i< Math.sqrt(maxNum); i++) {
	         if(bool[i] == true) {
	            for(int j = (i*i); j<maxNum; j = j+i) {
	               bool[j] = false;
	            }
	         }
	      }
	      */
	      System.out.println("List of prime numbers upto given number are : ");
	      for (int i = 2; i< bool.length; i++) {
	         if(bool[i]==true) {
	            System.out.println(i);
	         }
	      }
	      
	    
	    
	    
	    
	}

}
