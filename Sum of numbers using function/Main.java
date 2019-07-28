import java.util.Scanner;
class Main{
public static int sum(int num){int s=0;
  for(int n=1;n<=num;n++){ s=s+n;
                          
                         }return s;}
    
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int val=sum(n);
      System.out.println(val);
	}
}