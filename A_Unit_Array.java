import java.util.*;
public class A_Unit_Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int c1=0;
            int cm1=0;
            int ops=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==1){
                    c1++;
                }
                else if(arr[i]==-1){
                    cm1++;
                }
            }
            while(c1<cm1 || cm1%2==1){
                ops++;
                c1++;
                cm1--;
            }
            System.out.println(ops);
    }
}
}