package javaclassassignment;

import java.util.*;

public class StringAnagramOrNot {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Frist String : ");
		String s1=sc.nextLine();
		System.out.println("Enter the Second String : ");
		String s2=sc.nextLine();
		int flag=0;
		
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				if(c1[i]!=c2[i]) {
					flag=1;
					break;
				}
			}
		}
		
		if(flag==0)
			System.out.println("Anagram");
		else
			System.out.println("Not An Anagram");
	}

}
