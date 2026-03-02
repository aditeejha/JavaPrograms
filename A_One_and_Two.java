import java.util.*;
public class A_One_and_Two {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
           int n=sc.nextInt(); 
           int TotTwo=0;
           int[] arr=new int[n];
           for(int i=0; i<n; i++){
               arr[i]=sc.nextInt();
               if(arr[i]==2) TotTwo++;
           }  
           if(TotTwo%2!=0) System.out.println(-1);
           int target=TotTwo/2; 
           int k=0;
           for (int i=0; i<n; i++) {
                if(arr[i]==2) k++;
                if(k==target){
                     System.out.println(i+1);
                     break;
                }
           }
        }
    }
}