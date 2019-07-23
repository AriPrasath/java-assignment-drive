import java.util.*;

public class Frequency{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		int[] count=new int[256];
		int first=0,sec=0;
		for(int i=0;i<s.length();i++){
			count[(int)c[i]]+=1;	
		}
		for(int i=0;i<256;i++){
			if(count[i]>count[first] ){
				sec=first;
				first=i;	
			}else if ((count[i] > count[sec]) && (count[i] != count[first])) 
               			sec = i; 
			
		}
		char p=(char)sec;
		System.out.println(p);
	}
}

				
