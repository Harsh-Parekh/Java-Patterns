import java.util.Scanner;
class Diamond
{
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        System.out.print("Enter no of rows  :");
        int rows=o.nextInt();
        int count=rows;
        int col=rows;
        for(int i=0;i<rows;i++)
        {
            for(int j=col;j>=1;j--)
            {
                System.out.print(" ");
            }
            col--;
            for(int k=0;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=count;k>=1;k--)
            {
                System.out.print(" *");
            }
            count--;
            System.out.println("");
        }
    }
}
