import java.util.*;
public class A_Make_it_Beautiful{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int flag=0;
            int sum=0;
            int[] arr=new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
            }
            for (int i=0; i<n-1; i++) {
                sum+=arr[i];
                if(sum==arr[i+1]){
                    flag=1;
                    break;
                }
                
            }}
        }
    }
}

