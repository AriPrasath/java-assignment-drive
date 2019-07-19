package javaclassassignment;
import java.util.*;
public class maxMoney {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of inputs: ");
		int t=sc.nextInt();
		int money[]=new int[t];
		int n[]=new int[t];
		int out[]=new int[t];
		
		for(int i=0;i<t;i++) {
			System.out.println("Enter the money and no fo houses for street "+(i+1));
			money[i]=sc.nextInt();
			n[i]=sc.nextInt();
		}
		
		for(int i=0;i<t;i++) {
			for(int j=0;j<n[i];j+=2) {
				out[i]+=money[i];
			}
		}
		for(int i=0;i<t;i++){
			System.out.println("The amount can be stolen by thief in street "+(i+1)+" is "+out[i]);
		}
	}

}
