package javaclassassignment;
import java.util.*;
public class MatchingPair {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		int count=0;
		char[] c=s.toCharArray();
		
		String a="(";
		String b=")";
		
		char d=a.charAt(0);
		char e=b.charAt(0);
		
		for(int i=0;i<s.length();i++) {
			if(c[i]==d){
				count+=1;
			}else if(c[i]==e) {
				count-=1;
			}
				
		}
		if(count==0) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
