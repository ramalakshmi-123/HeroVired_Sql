class StarPattern
{
  public static void main(String args[])
  {
    int n = 5;
    int x = 1;


    for (int i = 1; i <= n; i++)
    {
      for (int j = 1; j <= x; j++)
      {
        System.out.print("*");
      }
      if (i <= n / 2)
      {
        x += 2;
      }
      else
      {
        x -= 2;
      }
      System.out.println();
    }

  }
}