import java.util.*;
class PrimeNumber{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int a[]={2, 29, 51, 8, 4};
        int c=-1;
        for(int i=0;i<n;i++)
        {
            int k=0;
            for(int j=2;j<a[i]/2;j++)
            {   
                if(a[i]%j==0)
                {
                    k=1;
                    break;
                }
            }
            if(k==0)
            {
                if(c<a[i])
                {
                    c=a[i];
                }
            }
        }
        if(c==-1)
        {
            System.out.println("There is no prime numbers");
        }
        else
        {
            System.out.println("The Largest Prime number in given array: "+c);
        }
    }
}