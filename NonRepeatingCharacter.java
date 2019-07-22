package javaclassassignment;

import java.util.*;
public class NonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag=0;
		String s1=sc.nextLine();
		
		char[] c=s1.toCharArray();
		
		for(int i=0;i<s1.length();i++) {
			flag=0;
			for(int j=0;j<s1.length();j++) {
				if(i!=j) {
					if(Character.toLowerCase(c[i])==Character.toLowerCase(c[j] )) {
						flag=1;
						break;
					}
				}
			}
			if(flag==1 && i==s1.length()){
				System.out.println("-1");
			}else if(flag==0){
				System.out.println(c[i]);
				break;
			}
		}

	}

}
