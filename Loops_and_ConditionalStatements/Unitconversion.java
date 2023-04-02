import java.util.Scanner;

class Unitconversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch='y';
        while(ch=='y' || ch=='Y'){
            System.out.println("Menu based app - Unit conversion for Distance");
            System.out.println("1. CM to M\n"+"2. M to KM\n"+"3. KM to M\n"+"4. M to CM");
            System.out.print("Enter your menu- ");
            int n=sc.nextInt();
            switch(n){
                case 1:
                {
                    System.out.print("Please enter the CM Value:");
                    int cm=sc.nextInt();
                    float m=(float)cm/100;
                    System.out.println(cm+" CM = "+m+" M" );
                    break;
                }
                case 2:
                {
                    System.out.print("Please enter the M Value:");
                    int met=sc.nextInt();
                    float km=(float)met/1000;
                    System.out.println(met+" M = "+km+" KM" );
                    break;
                }
                case 3:
                {
                    System.out.print("Please enter the KM Value:");
                    int klm=sc.nextInt();
                    int met=klm*1000;
                    System.out.println(klm+" KM = "+met+" M" );
                    break;
                }
                case 4:
                {
                    System.out.print("Please enter the M Value:");
                    int met=sc.nextInt();
                    int cem=met*100;
                    System.out.println(met+" M = "+cem+" CM" );
                    break;
                }
                default:
                System.out.println("Invalid Case");
            }
            System.out.print("Do you want to continue:");
            ch=sc.next().charAt(0);
        }
    }
}
