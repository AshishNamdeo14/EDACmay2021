import java.util.*;
class A13
{
  public static void main(String args[])
  {
   char Alpha = 65;
   for(int i=1;i<=5;i++)
   {
    for(int j=5;j>=i;j--)
	{
	System.out.print(" ");
	}
	
	for(int k=1;k<=i;k++)
	{
		System.out.print(Alpha +" ");
	    

	}
	System.out.println();
	Alpha++;
	}
	
   }
  }

   