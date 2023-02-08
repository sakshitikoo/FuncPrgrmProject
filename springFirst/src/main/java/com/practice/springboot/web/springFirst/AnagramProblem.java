package com.practice.springboot.web.springFirst;

import java.util.Scanner;

public class AnagramProblem {
	public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the First String: ");
	 String inp1=sc.next();
	 System.out.println("Enter the Second String: ");
	 String inp2=sc.next();
	 boolean isAnagram = checkStringIsAnagram(inp1,inp2);
	 System.out.println(isAnagram);
	 sc.close();
	}

	private static boolean checkStringIsAnagram(String fstr1, String fstr2) {
		
		if(fstr1.length() == fstr2.length()) {
			int found =0;
		      for(char ch1:fstr1.toCharArray())
		      {
		    	  for (char ch2 :fstr2.toCharArray())
		    	  {
		    		  if (ch1==ch2)
		    		  {
		    			  found++;
		    			  break;
		    		  }
		    	  }
		      }
		      
		      if (found ==fstr2.length())
		      {
		    	 return true;
		    	 
		      }
		      return false;
		}
		else
		{
			return false;
		}
	}
}
