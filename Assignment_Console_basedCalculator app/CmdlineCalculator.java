import java.util.*;

class Calculator {
    public static int factorial(int n) {
        if(n==1) return 1;
        return n * factorial(n-1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Command line calculator");

        System.out.println();
        int x = 1;
        while(x != 0) {
        	System.out.println("-------SELECT THE OPERATIONS SHOWN IN MENU -------");
        	System.out.print(" +. Addition \n -. Subtraction \n *.  Multiplication \n /. Division \n %. Percentage \n f. Factorial \n s. Square \n c. Cube \n s. Square Root \n p. a Power b \n R. a Root b \n x. Exit\n");
            System.out.println("SELECT THE SPECIFIC OPERAND");
            char s = sc.next().charAt(0);

            int a, b;
            try {
                switch(s) {
                    case '+': {
                        System.out.println("Enter the values of a and b");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("Addition of "+a+" and "+b+" is: "+ (a+b));
                        break;
                    }
                    case '-': {
                        System.out.println("Enter the values of a and b");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("Subtraction of "+a+" and "+b+" is: "+(a-b));
                        break;
                    }
                    case '*': {
                        System.out.println("Enter the values of a and b");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
                        break;
                    }
                    case '/': {
                        System.out.println("Enter the values of a and b");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("Division of "+a+" and "+b+" is: "+((float)a/b));
                        break;
                    }
                    case '%': {
                        System.out.println("Enter the values of a and b");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("Modulus of "+a+" and "+b+" is: "+(a%b));
                        break;
                    }
                    case 'F': 
                    case 'f':{
                        System.out.println("Enter the fact value");
                        a = sc.nextInt();
                        System.out.println("Factorial of "+a+" is: "+factorial(a));
                        break;
                    }
                    case '2': {
                        System.out.println("Enter the value");
                        a = sc.nextInt();
                        System.out.println("Square of "+a+" is: "+(a*a));
                        break;
                    }
                    case 'C':
                    case 'c':{
                        System.out.println("Enter the value");
                        a = sc.nextInt();
                        System.out.println("Cube of "+a+" is: "+(a*a*a));
                        break;
                    }
                    case 'S': 
                    case 's':{
                        System.out.println("Enter the values of a");
                        a = sc.nextInt();
                        System.out.println("Square root of "+a+" is: "+Math.sqrt(a));
                        break;
                    }
                    case 'P':
                    case 'p':{
                        System.out.println("Enter the values of a and b");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println(a+" to the power  of "+b+" is: "+Math.pow(a,b));
                        break;
                    }
                    case 'R': 
                    case 'r':{
                        System.out.println("Enter the values of b and a");
                        int aa = sc.nextInt();
                        int bb = sc.nextInt();
                        double root = Math.round(Math.pow(bb, 1.0/aa));
                        System.out.println(root);
                        break;
                    }
                    case 'X':
                    case 'x':{
                        x = 0;
                        break;
                    }
                }
            } catch(ArithmeticException e) {
                System.out.println("An arithmetic exception occurred: " + e.getMessage());
            } catch(InputMismatchException e) {
                System.out.println("InputMismatchException occurred: " + e.getMessage());
            }
        }
    }


}
