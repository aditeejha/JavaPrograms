import java.util.*;
public class A_Forbidden_Integer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            if(x!=1){
                System.out.println("Yes");
                System.out.println(n);
                for(int i=1;i<=n;i++){
                    System.out.print(1 + " ");
                }
                System.out.println();
            }
            else if(n%2==0){
                System.out.println("Yes");
                System.out.println(n/2);
                for(int i=1;i<=n/2;i++){
                    System.out.print(2 + " ");
                }
                System.out.println();
            }
            else if(n%2!=0){
                System.out.println("Yes");
                System.out.println(3);
                for(int i=1; i<=(n-3)/2; i++){
                    System.out.print(2 + " ");
                }
                System.out.println();
            }
            else{
                System.out.println("No");
            }
        }
    }
}