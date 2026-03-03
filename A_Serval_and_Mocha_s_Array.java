import java.util.*;
public class A_Serval_and_Mocha_s_Array {  
    static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int g = 0;  
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                g = gcd(g, arr[i]);
            }
            if(g == 1){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}