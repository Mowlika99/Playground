import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
Scanner in = new Scanner(System.in);
int arr_size = in.nextInt();
int arr[] = new int[arr_size];
for(int idx = 0; idx <= arr_size - 1; idx++)
{
  arr[idx] = in.nextInt();
}
int search_elem_1=in.nextInt();
int search_elem_2=in.nextInt();
int elem1_idx=-1;
int elem2_idx=-1;
for(int idx = 0; idx <= arr_size - 1; idx++)
{
if(search_elem_1==arr[idx])
{
 elem1_idx=idx;
}
if(search_elem_2==arr[idx])
{
elem2_idx=idx;
}
}
System.out.println(elem1_idx);            
System.out.println(elem2_idx);            
}
}