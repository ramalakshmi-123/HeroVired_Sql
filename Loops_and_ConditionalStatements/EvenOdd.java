import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Menu based app - Even/Odd Checker");
        Scanner sc=new Scanner(System.in);
        char s='y';
        while(s=='y' || s=='Y'){
        System.out.println("Please enter the number");
        int k=sc.nextInt();
        if(k%2==0){
            System.out.println("The given number "+k+" is a EVEN number");
        }
        else{
            System.out.println("The given number "+k+" is an ODD number");
        }
        System.out.println("Do you want to continue");
        s=sc.next().charAt(0);
    }
    }
}
