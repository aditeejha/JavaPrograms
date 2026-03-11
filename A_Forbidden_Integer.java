import java.util.*;
public class A_Forbidden_Integer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            int sum=n;
            int cnt=0;
            for(int i=1; i<=k; i++){
                if(i!=x){
                    while(sum>=0) sum-=i;
                    cnt++;
                }
                if(sum==0){
                    System.out.println("YES");
                    System.out.println(cnt);
                    System.out.print(i+ " ");
                    break;
                }
            }
        }
    }
}