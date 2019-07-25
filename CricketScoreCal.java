import java.util.*;

public class CricketScoreCal{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int tw=10,w=0,ball=0,wide=0,runs=0,k=1,l=0,m=0;
		String s=sc.nextLine();
		int p[]=new int[11];
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='O' && tw>0){
				w+=1;
				tw-=1;
				ball+=1;
				if(m==k){
					if(k>l){
						k=k+1;
					}else{
						k=l+1;
					}
					m=k;
				}
				else{
					if(k>l){
						l=k+1;
					}else{
						l=l+1;
					}
					m=l;
				}
				if(ball%6==0){
					if(m==l)
						m=k;
					else
						m=l;
				}
			}else if(s.charAt(i)=='W'){
				wide+=1;
				runs+=1;
			}else if(s.charAt(i)=='.'){
				ball+=1;
				if(ball%6==0){
					if(m==l)
						m=k;
					else
						m=l;
				}
			}else{
				p[m]+=Character.getNumericValue(s.charAt(i));
				runs+=Character.getNumericValue(s.charAt(i));
				if(Character.getNumericValue(s.charAt(i))%2!=0){
					if(m==l)
						m=k;
					else
						m=l;
				}
				ball+=1;
				if(ball%6==0){
					if(m==l)
						m=k;
					else
						m=l;
				}
			}
		}
		for(int i=0;i<=w+1;i++){
			System.out.println("p["+(i+1)+"] = "+p[i]);
		}
		System.out.println("Strike : p" +(m+1));
		if(m==k){
			System.out.println("Non Strike : p" +(l+1));
		}else{
			System.out.println("Non Strike : p" +(k+1));
		}
		System.out.println("total : " +runs);
		System.out.println("over : " +ball/6 + "."+ball%6);
		System.out.println("Extras : " +wide);
		System.out.println("Wickets : " +w);
		System.out.println("Remaining Wickets : " +tw);
	}
}