import java.util.Scanner;
class Move{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=10;
        int a[]={3, 1, 4, 1, 2, 1, 8, 3, 2, 1};
        int c=0,j=0;
        for(int i=0; i<n; i++){
            if(a[i]==1){
                c+=1;
            }
            else{
          a[j]=a[i];
          j+=1;
            }
        }
        System.out.print("Array elements after moving Ones to end: ");
        for(int i=0; i<c; i++){
            a[j]=1;
            j+=1;
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i]+",");
        }
    }
}