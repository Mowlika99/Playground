import java.util.Scanner;
class Main
{public static int square(int num){
  int sq=num*num;
  return sq;}
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int square=square(n);
      System.out.println(square);
	   
	} 
}