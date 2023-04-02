import java.util.Scanner;
class Swapping{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2,temp;
        System.out.print("numA = ");
        num1=sc.nextInt();
        System.out.print("numB = ");
        num2=sc.nextInt();
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("numA = "+num1);
        System.out.println("numB = "+num2);

    }
}