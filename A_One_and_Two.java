import java.util.*;

public class A_One_and_Two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(); 
            int totalTwos = 0;
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] == 2) totalTwos++;
            }
            if(totalTwos % 2 != 0){
                System.out.println(-1);
                continue; 
            }
            int target = totalTwos / 2;
            int leftTwos = 0;
            for(int i = 0; i < n - 1; i++){
                if(arr[i] == 2) leftTwos++;
                if(leftTwos == target){
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
} 