package ari;
import java.util.*;
public class Pattern1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=6,temp=1,alp=65;
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			int o=alp;
			System.out.print(" ");
			for(int k=0;k<=i;k++) {
				System.out.print((char)(o));
				o+=1;
			}
			alp+=1;
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=n;j>i;j--) {
				System.out.print(j);
			}
			int temp1=temp;
			System.out.print(" ");
			for(int j=n;j>i;j--) {
				System.out.print(temp1);
				temp1+=2;
			}
			temp+=2;
			System.out.println();
		}
	}
}
