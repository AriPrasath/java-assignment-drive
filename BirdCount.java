package javaclassassignment;
import java.util.*;
public class BirdCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of birds crossed :");
		int n=sc.nextInt();
		int[] a=new int[5];
		int[] arr=new int[n];
		System.out.println("Enter the array of birda crossed :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(i<5)
				a[i]=0;
		}
		for(int i=0;i<n;i++) {
			if(arr[i]<6 && arr[i]>0)
				a[arr[i]-1]+=1;
			else
				System.out.println("Invald bird.");
		}
		int max=a[0];
		int max1=0;
		for(int i=1;i<5;i++) {
			if(max<a[i]) {
				max=a[i];
				max1=i;
			}
		}
		System.out.println(max1+1);
	}

}
