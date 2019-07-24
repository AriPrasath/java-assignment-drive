import java.util.*;

public class CricketScore{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int tw=10,w=0,ball=0,wide=0,runs=0,k=0,l=1,m=l;
		String s=sc.nextLine();
		int p[]=new int[11];
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='O' && tw>0){
				w+=1;
				tw-=1;
				ball=1;
				k+=1;
				if(m==k){
					k=w+1;
					m=k;
				}
				else{
					l=w+1;
					m=l;
				}
			}else if(s.charAt(i)=='W'){
				wide+=1;
				runs+=1;
			}else if(s.charAt(i)=='.'){
				ball+=1;
			}else{
				p[m]+=(int)(s.charAt(i));;
				if((int)(s.charAt(i))%2!=0){
					if(m==l)
						m=k;
					else
						m=l;
				}
				if(ball%6==0){
					if(m==l)
						m=k;
					else
						m=l;
				}
			}
		}
		for(int i=0;i<w;i++){
			System.out.println("p["+i+1+"] = "+p[i]);
		}
		System.out.println("Strike : p" +m);
		if(m==k){
			System.out.println("Strike : p" +l);
		}else{
			System.out.println("Strike : p" +k);
		}
		System.out.println("total : " +runs);
		System.out.println("over : " +ball/6 + "."+ball%6);
		System.out.println("Extras : " +wide);
		System.out.println("Wickets : " +w);
		System.out.println("Remaining Wickets : " +tw);
	}
}
					





















			
				