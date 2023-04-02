import java.util.Arrays;
class SortArray{
    public static void main(String[] args) {
        int n=5;
        int array[]={23, 21, 44, 32, 12};
        int t[]=array;
        Arrays.sort(t);
        System.out.print("The elements in ascending order: ");
        for(int i=0; i<n; i++){
           System.out.print(t[i]+",");
          }
        System.out.print("\nThe elements in descending order:");
        for(int i=n-1; i>=0; i--){
            System.out.print(t[i]+",");
           }
    
    }
}