import java.util.*;
public class A_Walking_Master{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int[] arr=new int[4];
            for (int i = 0; i <4; i++) {
                arr[i]=sc.nextInt();
            }
            if(arr[3]<arr[1]){
                System.out.println(-1);
            }
            else{
                int ans=(arr[3]-arr[1])+(arr[2]-arr[0]);
                System.out.println(ans);
            }
            }
        }
    }