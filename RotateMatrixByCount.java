package javaclassassignment;

import java.util.*;


public class RotateMatrixByCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows of matrix : ");
		int n=sc.nextInt();
		System.out.println("Enter the columns of matrix : ");
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		int h=n%2;
		h+=n/2;
		int arr1[][]=new int[h][(m*n)];
		System.out.println("Enter the matrix : ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the count to be rotated :");
		int count=sc.nextInt();
		int len[]=new int[h];
		
		//To store the matrix by cyclic method in array
		
		int k=-1,l=-1,b;	
		int f=m+1,g=n+1;
		for(int i=0;i<h;i++) {
			b=0;
			l+=1;
			k+=1;
			f-=1;
			g-=1;
			int x=l,y=k;
			while(x<f) {
				arr1[i][b]=arr[y][x];
				b+=1;
				x+=1;
			}y+=1;
			x-=1;
			while(y<g) {
				arr1[i][b]=arr[y][x];
				b+=1;
				y+=1;
			}y-=1;
			x-=1;
			while(x>=l) {
				arr1[i][b]=arr[y][x];
				b+=1;
				x-=1;
			}
			x+=1;
			y-=1;
			while(y>k) {
				arr1[i][b]=arr[y][x];
				b+=1;
				y-=1;
			}
			len[i]=b;
		}
		for(int i=0;i<h;i++) {
			for(int e=0;e<count;e++){
				int temp=arr1[i][len[i]-1];
				for(int j=len[i]-1;j>=0;j--) {
					if(j>0)
						arr1[i][j]=arr1[i][j-1];
					else
						arr1[i][j]=temp;
				}
			}
		}
		
		//storing the arrays after rotating in the matrix
		k=-1;
		l=-1;	
		f=m+1;
		g=n+1;
		for(int i=0;i<h;i++) {
			b=0;
			l+=1;
			k+=1;
			f-=1;
			g-=1;
			int x=l,y=k;
			while(x<f) {
				arr[y][x]=arr1[i][b];
				b+=1;
				x+=1;
			}y+=1;
			x-=1;
			while(y<g) {
				arr[y][x]=arr1[i][b];
				b+=1;
				y+=1;
			}y-=1;
			x-=1;
			while(x>=l) {
				arr[y][x]=arr1[i][b];
				b+=1;
				x-=1;
			}
			x+=1;
			y-=1;
			while(y>k) {
				arr[y][x]=arr1[i][b];
				b+=1;
				y-=1;
			}
		}
		
		//print the matrix after rotation
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+"    ");
			}
			System.out.println();
		}

	}
}