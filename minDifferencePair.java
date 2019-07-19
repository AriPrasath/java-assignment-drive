package javaclassassignment;
import java.util.*;
public class minDifferencePair {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of numbers :");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the size of "+(i+1)+" th array");
			a[i]=sc.nextInt();
		}
		
		int arr[][]=new int[n][100];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+(i+1)+" Arrays : ");
			for(int j=0;j<a[i];j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int k=0;k<a[i];k++) {
				for(int j=k+1;j<a[i];j++) {
					if(arr[i][j]>arr[i][j+1]) {
						int temp=arr[i][j];
						arr[i][j]=arr[i][j+1];
						arr[i][j+1]=temp;
					}
				}

			}
		}
		
		
		
		int[][] min=new int[n][100];
		int neww[]=new int[n];
		for(int i=0;i<n;i++) {
			neww[i]=1000;
			for(int j=1;j<a[i];j++) {
				min[i][j-1]=arr[i][j]-arr[i][j-1];
				if(min[i][j-1]<0)
					min[i][j-1]=-(min[i][j-1]);
				if(neww[i]>min[i][j-1])
					neww[i]=min[i][j-1];
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println("The min diff bw the array "+(i+1)+" is "+neww[i]);
		}

	}

}
