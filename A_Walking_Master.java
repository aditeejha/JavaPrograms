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
                int yop=arr[3]-arr[1];
                int newx=arr[0]+yop;
                int xop=Math.abs(newx-arr[2]);
                System.out.println(yop+xop);
            }
            }
        }
    }