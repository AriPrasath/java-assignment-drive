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
	public static ArrayList<Hotel> ar=new ArrayList<Hotel>();

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max=0,min=0;
		
		for(int i=0;i<n;i++) {
			String temp1=sc.next();
			temp1=temp1.replace("{","");
			temp1=temp1.replace("}","");
			int  t1,t2;
			String t3;
			String[] temp =temp1.split(",");
			t1=Integer.parseInt(temp[0]);
			t2=Integer.parseInt(temp[1]);
			t3=temp[2];
			ar.add(new Hotel(t1,t2,t3));
		}
		int t1=0,t3=0;
		Hotel t2;
		String s1="enter";
		ListIterator<Hotel> h=ar.listIterator();
		while(h.hasNext()){
			
			Hotel temp=(Hotel) h.next();
			
			if(temp.type.equals(s1)) {
				min+=temp.nop;
			}else {
				
				min-=temp.nop;
			}
			if(min>max) {
				max=min;
				t1=temp.time;
					
				t2=h.next();
				t3=t2.time;

				t2=h.previous();
				
			}
		}
		System.out.println(t1+ "  " +t3);
	}

}