import java.util.*;
public class A_Forbidden_Integer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            int sum=0;
            for(int i=1; i<=k; i++){
                if(i!=x){
                    sum+=i;
                }
                if(sum==i || sum>i) break;
            }
        }
    }
}