package javaclassassignment;
import java.util.*;

public class countXInRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of inputs : ");
		
		int t=sc.nextInt();
		
		int x[]=new int[t];
		int ub[]=new int[t];
		int lb[]=new int[t];
		int temp[]=new int[t];
		
		for(int i=0;i<t;i++) {
			
			System.out.println("Enter the number from 0-9 : ");
			x[i]=sc.nextInt();
			
			System.out.println("Enter the lower bound : ");
			lb[i]=sc.nextInt();
			
			System.out.println("Enter the upper bound : ");
			ub[i]=sc.nextInt();
			
		}
		int k;
		
		for(int i=0;i<t;i++) {
			temp[i]=0;
			for(int g=lb[i]+1;g<ub[i];g++) {

				int[] c=new int[10];
				int m=g;
				k=0;
				do { 
					c[k] = m % 10; 
					m /= 10; 
					k++; 
				} while (m != 0); 
				
				for(int j=0;j<k;j++) {
					if(c[j]==x[i])
						temp[i]+=1;
				}
			}
		}
		
		for(int i=0;i<t;i++)
			System.out.println("The result of "+x[i]+" in "+lb[i]+" and "+ub[i]+" is "+temp[i]);
			
	}

}
