class ReverseArray {
    public static void main(String[] args) {
        int n=10;
        int arr[]={31, 42, 25, 21, 56,  61, 13, 45, 76, 55};
        System.out.println("The elements in reverse order - ");
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+",");
        }
    }
}
