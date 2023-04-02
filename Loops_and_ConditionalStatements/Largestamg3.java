import java.util.*;
class Largestamg3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("num1 = ");
        a=sc.nextInt();
        System.out.print("num2 = ");
        b=sc.nextInt();
        System.out.print("num3 = ");
        c=sc.nextInt();
        int large=( c > (a > b ? a : b) ? c : ((a > b) ? a : b));
        int smallest=(c < (a < b ? a : b) ? c : ((a < b) ? a : b));  
        System.out.println("The Smallest Number:"+smallest);
        System.out.println("The Largest Number:"+large);
        System.out.println("Average of all three Numbers:"+(a+b+c)/3);

    }
}