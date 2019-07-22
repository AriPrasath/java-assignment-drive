package javaclassassignment;
import java.util.*;
public class BithdayChocolate {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of strings to be in array :");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the month : ");
		int m=sc.nextInt();
		System.out.println("Enter the date : ");
		int d=sc.nextInt();
		System.out.println("Enter the array : ");
		for(int k=0;k<n;k++){
			a[k]=sc.nextInt();
		}
		int j=0,i=0,sum=0,count=0;
		for(;j<a.length;j++) {
			sum+=a[j];
			
			if(sum>d) {
				sum-=a[i];
				i++;
			}else if(j-i==m-1) {
				if(sum==d) 
					count++;
				sum-=a[i];
				i++;
			}
		}
		System.out.println(count);
	}

}
