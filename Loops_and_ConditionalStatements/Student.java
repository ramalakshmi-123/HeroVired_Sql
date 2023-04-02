import java.util.Scanner;

class Student{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char grade;
        double cgpa;
        double x,y;
        System.out.print("Marks Obtained by a Student: ");
        x=sc.nextInt();
        System.out.print("Total Marks: ");
        y=sc.nextInt();
        
        double per=(x/y)*100;
        if(per<=59){
            grade='F';
            cgpa=0.0;
        }
        else if(per>59 && per<=69){
            grade='D';
            cgpa=1.0;
        }
        else if(per>69 && per<=79){
            grade='C';
            cgpa=2.0;
        }
        else if(per>79 && per<=89){
            grade='B';
            cgpa=3.0;
        }
        else{
            grade='A';
            cgpa=4.0;
        }
       System.out.println("Percentage: "+String.format("%.2f",per)+"%");
       System.out.println("Grade "+grade+" GPA "+cgpa);

    }
}