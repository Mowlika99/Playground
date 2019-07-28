import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int base=in.nextInt();
      int ex=in.nextInt();
      System.out.println(power( base, ex));}
  public static int power(int base,int ex){
    int power=1;
    while(ex>=1){
      power=power*base;
      ex--;}
    return power;}}