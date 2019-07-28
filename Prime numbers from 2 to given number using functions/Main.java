import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int num=2;num<=n;num++){
        if(is_prime(num)){
          System.out.println(num);}}
	}
  public static boolean is_prime(int m){
    boolean is_prime=true;
    for(int i=2;i<=m/2;i++){
      if(m%i==0){
         is_prime=false;}}
    return is_prime;}
}