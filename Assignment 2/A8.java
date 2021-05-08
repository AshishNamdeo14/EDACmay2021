class A8
{
 public static void main(String args[])
 {
  int a=5;
  int b=1;
  for(int i=1;i<=5;i++)
  {
  for(int j=5;j>i;j--)
  {
   System.out.print(" ");
  }
   for(int k=1;k<=i;k++)
   {
    System.out.print(a++ +" ");
   }
   a--;
   a=a-b;
   b++;
    System.out.println();
   }
  
 }
}
