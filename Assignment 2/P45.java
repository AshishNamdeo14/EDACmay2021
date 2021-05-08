class P45
{
 public static void main(String args[])
 {
  int a=9;
  int b=1;
  int c=8;
  for(int i=1;i<=9;i++)
  {
  for(int j=9;j>i;j--)
  {
   System.out.print(" " +" ");
  }
   for(int k=1;k<=i;k++)
   {
    System.out.print(a++ +" ");
   }
   for(int l=2;l<=i;l++)
   {
	System.out.print(c-- +" ");
   }
   a--;
   a=a-b;
   b++;
   c=8;
    System.out.println();
   }
  
 }
}
