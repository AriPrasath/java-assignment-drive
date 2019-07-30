package ari;
import java.util.*;

class Hotel{
	int time;
	int nop;
	String type;
	
	public Hotel(int time,int nop,String type) {
		this.time=time;
		this.nop=nop;
		this.type=type;
	}
}



public class BusiestPeriod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		for(int i=0;i<n;i++) {
			String temp1=sc.next();
			temp1.replace("{","");
			temp1.replace("}","");
			String[] temp =temp1.split(",");
			for(int j=0;j<temp.length;j++) {
				System.out.println(temp[j]);
			}
		}
	}

}
