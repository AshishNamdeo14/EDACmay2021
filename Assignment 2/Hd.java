class Hd
{
	public static void main(String arg[])
	{
	for(int j=1;j<=6;j++)
	   {
		for(int i=6;i>=j;i--)
		{
		 if(i==6 || j==1 || i==j)
		  {
		   System.out.print("*");
		  }
		  else
		  {
			  System.out.print(" ");
		  }
		}
		   System.out.println("");
	   }
}	
}