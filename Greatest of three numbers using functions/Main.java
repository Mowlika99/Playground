import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
int n1=in.nextInt();
 int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.println(greatest(n1,n2,n3));
	}
  public static int greatest(int i,int j,int k){
    int x;
    if(i>j){
      x=i;}
    else{
      x=j;}
      if(x>k){
        return x;}
    else{
      return k;}}
      
    
}
