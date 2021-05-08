class A10
{
	public static void main(String args[])
		{
  
			int a=69;
			int b=1;
			for(int i=1;i<=5;i++)
			{
				for(int j=5;j>i;j--)
				{
					System.out.print(" ");
				}
			    for(int k=1;k<=i;k++)
			    {
					System.out.print((char)a++ +" ");
			    }
			    a--;
			    a=a-b;
			    b++;
				System.out.println();
			}
  
		}
}