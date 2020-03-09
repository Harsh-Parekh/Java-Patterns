import java.util.Scanner;
class Pattern
{
	public static void main(String args[])
	{
		Scanner o=new Scanner(System.in);
		int row;
		System.out.print("Enter no of rows :");
		row=o.nextInt();
		int col=row;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<col;j++)
				System.out.print(" ");
			col--;
			for (int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
}
