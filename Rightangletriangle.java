import java.util.Scanner;
class Rightangletriangle
{
  public static void main(String args[])
  {
    Scanner o=new Scanner(System.in);
    int n;
    System.out.print("Enter no of rows :");
    n=o.nextInt();
    for (int i=0;i<n;i++)
    {
      for(int j=0;j<=i;j++)
      {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
 }
