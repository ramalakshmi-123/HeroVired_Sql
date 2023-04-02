import java.util.*;
class Substring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("stringName: ");
        String str=sc.nextLine();
        int a,b;
        System.out.print("Starting index: ");
        a=sc.nextInt();
        System.out.print("Ending index: ");
        b=sc.nextInt();
        System.out.print("subString of Mangalyaan from "+a+" to "+b+" is: "+str.substring(a+1,b+2));

    }
}