import java.util.*;

class Frequency{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        int n=17;
        int a[]={3, 1, 3, 4, 1, 2, 1, 8, 3, 2, 1, 1, 3, 2, 3, 3, 4};
        int m=sc.nextInt();
        Set<Integer> s = new HashSet<>();
        for (int i=0;i<m;i++) {
            s.add(sc.nextInt());
        }
        Map<Integer, Integer> fmp = new HashMap<>();
        for (int num : a) {
            if (s.contains(num)) {
                fmp.put(num, fmp.getOrDefault(num, 0) + 1);
            }
        }
        for (int num : s) {
            System.out.println("Frequency of " + num + ": " + fmp.getOrDefault(num, 0));
        }
    }
}
//enter the length and elements of array b:
//{1, 2, 3, 5, 9}
