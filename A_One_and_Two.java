import java.util.*;
public class A_One_and_Two {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int k=0;
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            int prod=1;
            int p=1;
            for (int i=0; i<n-1; i++){
                prod*=arr[i];
                k++;
                for(int j=i+1; j<n; j++){
                    p*=arr[j];
                }
                if(prod==p){
                        break;
                }
            }
            if(k==0 || k==n-1){
                k=-1;
            }
            System.out.println(k);
        }
    }
}