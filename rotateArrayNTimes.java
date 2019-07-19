package javaclassassignment;
import java.util.*;
public class rotateArrayNTimes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of testcases: ");
		int t=sc.nextInt();
		int n[]=new int[t];
		int d[]=new int[t];
		int arr[][]=new int[t][100];
		
		for(int i=0;i<t;i++) {
			System.out.println("Enter the size and no of bits to be rotated of "+(i+1)+" bits");
			n[i]=sc.nextInt();
			d[i]=sc.nextInt();
			System.out.println("Enter the "+(i+1)+ " array");
			for(int j=0;j<n[i];j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<t;i++) {
			for(int j=0;j<d[i];j++) {
				int temp=arr[i][0];
				for(int k=0;k<n[i]-1;k++) {
					arr[i][k]=arr[i][k+1];
				}
				arr[i][n[i]-1]=temp;
			}
		}
		System.out.println("Enter the rotated array is :");
		
		for(int i=0;i<t;i++) {
			for(int j=0;j<n[i];j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
